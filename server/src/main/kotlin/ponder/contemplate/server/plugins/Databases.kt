package ponder.contemplate.server.plugins

import io.ktor.server.application.*
import klutch.environment.readEnvFromPath

fun Application.configureDatabases() {
    initDb(env)
}

val env = readEnvFromPath()
