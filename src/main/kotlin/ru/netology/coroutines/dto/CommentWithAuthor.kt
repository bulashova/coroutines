package ru.netology.coroutines.dto

data class CommentWithAuthor(
    val comment: Comment,
    val author: Author,
) {
    override fun toString(): String =
        "\nАвтор комментария: ${author.name}\nid поста: ${comment.postId}\n${comment.content}\n"
}
