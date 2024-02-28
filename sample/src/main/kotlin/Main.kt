import com.jocmp.feedfinder.DefaultFeedFinder
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) {
    val feedFinder = DefaultFeedFinder()

    println("Searching for ${args[0]}")

    val result = runBlocking {
        feedFinder.find(args[0])
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