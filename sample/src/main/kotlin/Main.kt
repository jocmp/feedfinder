import com.jocmp.feedfinder.DefaultFeedFinder
import com.jocmp.feedfinder.FeedFinder
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) {

    println("Searching for ${args[0]}")

    val result = runBlocking {
        FeedFinder.find(args[0])
    }

    result.fold(
        onSuccess = {feeds ->
            println("Found:")
            feeds.forEach { feed ->
                println("${feed.name} - ${feed.feedURL}")
            }
        },
        onFailure = {
            println("No results found")
        }
    )
}