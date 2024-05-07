package ru.netology.coroutines.dto

data class PostWithAuthorAndComments(
    val post: Post,
    val author: Author,
    val comments: List<CommentWithAuthor>,
) {
    override fun toString(): String =
        "\n\nАвтор поста: ${author.name}\nid: ${post.id}\nПост: ${post.content}\n\nКомментарии: $comments"
}
