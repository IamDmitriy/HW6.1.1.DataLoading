package com.easyapps.ncraftmedia

import com.google.gson.Gson
import java.io.File
import java.io.FileWriter

fun main() {
    val jsonContent = Gson().toJson(generateContent())

    val fileWriter = FileWriter(File("posts.json"))
    fileWriter.write(jsonContent)
    fileWriter.close()
}

fun generateContent(): List<Post> {
    var maxId: Long = 0

    return listOf(
        Post(
            id = maxId++,
            author = "Netology",
            content = "First post in our network!",
            created = 1588712400000,
            type = PostType.EVENT,
            address = "Варшавское ш., 1, с. 17. Бизнес-центр W Plaza-2",
            sharedByMe = true,
            countShares = 1,
            commentedByMe = true,
            countComments = 1
        ), Post(
            id = maxId++,
            author = "Netology",
            content = "First post in our network!",
            created = 1583010000000,
            type = PostType.EVENT,
            location = Location(55.703810, 37.623851)
        ), Post(
            id = maxId++,
            author = "Netology",
            content = "REPOST: First post in our network!",
            created = 1583010000000,
            source = Post(
                id = maxId++,
                author = "Netology",
                content = "someContent",
                created = 1551819600000
            ),
            type = PostType.REPOST
        ), Post(
            id = maxId++,
            author = "Netology",
            content = "REPOST: First post in our network!",
            created = 1583010000000,
            type = PostType.REPOST
        ), Post(
            id = maxId++,
            author = "Netology",
            content = "First post in our network!",
            created = 1520283600000,
            type = PostType.ADVERTISEMENT,
            link = "https://www.google.com/"
        ), Post(
            id = maxId++,
            author = "Netology",
            content = "First post in our network!",
            created = 1520283600000,
            videoUrl = "https://www.youtube.com/watch?v=WhWc3b3KhnY",
            type = PostType.VIDEO
        ), Post(
            id = maxId++,
            author = "Netology",
            content = "First post in our network!",
            created = 1520283600000,
            type = PostType.POST
        ), Post(
            id = maxId++,
            author = "Netology",
            content = "First post in our network!",
            created = 1588712400000,
            type = PostType.EVENT,
            address = "Варшавское ш., 1, с. 17. Бизнес-центр W Plaza-2"
        ), Post(
            id = maxId++,
            author = "Netology",
            content = "First post in our network!",
            created = 1583010000000,
            type = PostType.EVENT,
            location = Location(55.703810, 37.623851)
        ), Post(
            id = maxId++,
            author = "Netology",
            content = "REPOST: First post in our network!",
            created = 1583010000000,
            source = Post(
                id = maxId++,
                author = "Netology",
                content = "someContent",
                created = 1551819600000
            ),
            type = PostType.REPOST
        ), Post(
            id = maxId++,
            author = "Netology",
            content = "First post in our network!",
            created = 1520283600000,
            type = PostType.ADVERTISEMENT,
            link = "https://www.google.com/"
        ), Post(
            id = maxId++,
            author = "Netology",
            content = "First post in our network!",
            created = 1520283600000,
            videoUrl = "https://www.youtube.com/watch?v=WhWc3b3KhnY",
            type = PostType.VIDEO
        ), Post(
            id = maxId++,
            author = "Netology",
            content = "First post in our network!",
            created = 1520283600000,
            type = PostType.POST
        ), Post(
            id = maxId++,
            author = "Netology",
            content = "First post in our network!",
            created = 1588712400000,
            type = PostType.EVENT,
            address = "Варшавское ш., 1, с. 17. Бизнес-центр W Plaza-2"
        ), Post(
            id = maxId++,
            author = "Netology",
            content = "First post in our network!",
            created = 1583010000000,
            type = PostType.EVENT,
            location = Location(55.703810, 37.623851)
        ), Post(
            id = maxId++,
            author = "Netology",
            content = "REPOST: First post in our network!",
            created = 1583010000000,
            source = Post(
                id = maxId++,
                author = "Netology",
                content = "someContent",
                created = 1551819600000
            ),
            type = PostType.REPOST
        ), Post(
            id = maxId++,
            author = "Netology",
            content = "First post in our network!",
            created = 1520283600000,
            type = PostType.ADVERTISEMENT,
            link = "https://www.google.com/"
        ), Post(
            id = maxId++,
            author = "Netology",
            content = "First post in our network!",
            created = 1520283600000,
            videoUrl = "https://www.youtube.com/watch?v=WhWc3b3KhnY",
            type = PostType.VIDEO
        ), Post(
            id = maxId++,
            author = "Netology",
            content = "First post in our network!",
            created = 1520283600000,
            type = PostType.POST
        )
    )
}