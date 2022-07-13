package com.violeth.jbun

import com.github.dockerjava.api.DockerClient
import com.github.dockerjava.core.DockerClientBuilder

class JBunRuntime {
    private val image: JBunImage = JBunImage()
    private val client: DockerClient = DockerClientBuilder.getInstance().build()

    fun init() {
        image.pullImageFile(client)
    }

    fun main(): Unit {
        init()
    }
}