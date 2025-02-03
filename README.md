## Задание к занятию «Coroutines: легковесные потоки, Thread Pools & Dispatchers» (AuthorId)

dto сервера содержит:

```kotlin
data class Post(
    val id: Long,
    val authorId: Long,
    val content: String,
    val published: Long,
    val likedByMe: Boolean,
    val likes: Int = 0,
    var attachment: Attachment? = null,
)

data class Attachment(
    val url: String,
    val description: String,
    val type: AttachmentType,
)

data class Comment(
    val id: Long,
    val postId: Long,
    val authorId: Long,
    val content: String,
    val published: Long,
    val likedByMe: Boolean,
    val likes: Int = 0,
)

data class Author(
    val id: Long,
    val name: String,
    val avatar: String,
)
```

В постах и комментариях нет ни имени автора, ни аватарки. Для отображения имени автора необходим запрос `/api/authors/{id}`, где `{id}` — это идентификатор автора. Запроса `getAll` для авторов нет.

Получение авторов для постов и для комментариев реализовано с помощью `async`/`await` .

Проект представляет такую последовательность вызовов, в результате которой в консоль выводится коллекция из постов с именами авторов и комментариями. Комментарии также представлены с именами авторов.

```
Автор поста: Сбер
id: 2
Пост: Привет, это новый Сбер!

Комментарии: [
Автор комментария: Netology
id поста: 2
Комментарий: Новый логотип прекрасен!
], 

Автор поста: Netology
id: 1
Пост: Привет, это новая Нетология!

Комментарии: [
Автор комментария: Netology
id поста: 1
Комментарий: Отлично!
, 
Автор комментария: Сбер
id поста: 1
Комментарий: Мы тоже обновились!
]
```