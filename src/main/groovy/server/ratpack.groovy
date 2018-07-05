package server

import groovy.sql.Sql
import groovy.transform.Canonical
import org.postgresql.ds.PGSimpleDataSource
import ratpack.form.Form
import ratpack.groovy.sql.SqlModule
import ratpack.jackson.Jackson
import ratpack.jackson.guice.JacksonModule
import ratpack.service.Service
import ratpack.session.Session
import ratpack.session.SessionModule

import javax.sql.DataSource

import static ratpack.jackson.Jackson.*
import static ratpack.groovy.Groovy.*

import ratpack.server.RatpackServer
import ratpack.server.ServerConfig


ratpack {
    bindings {
        module(SqlModule)
        module(SessionModule)
        add(new JacksonModule())
        bindInstance DataSource, new PGSimpleDataSource(
                URL: "jdbc:postgresql://localhost/luncher",
                user: "pg",
                password: "pggg"
        )
    }
    handlers {
        get {
            render "GEneral get"
        }
        get("newUser") { Session session ->
            session.set("STATE","CREATED")
            response.cookie("LUNCHERUID","integrationtest")
            render("")
        }
        post("nick") { Sql sql ->
            parse(Form).then({
                Form form ->
                    def name = form.get("name")
                    def userInsertResut = sql.execute("insert into users(nick) values(?)",[name])
                    render("##${userInsertResut}##")
            })
        }
    }
}