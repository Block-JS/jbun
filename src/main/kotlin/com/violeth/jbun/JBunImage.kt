package com.violeth.jbun

import com.github.dockerjava.api.DockerClient
import java.io.File

class JBunImage {
    private val imageFile = JBunImage::class.java.getResource("/dockerimage.tar")?.file

    fun pullImageFile(client: DockerClient) {
        if (imageFile == null) {
            throw IllegalStateException("Image file not found")
        }

        client.loadImageCmd(File(imageFile).inputStream()).exec()
    }
}