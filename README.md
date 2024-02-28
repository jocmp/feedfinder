# FeedFinder.kt

Find RSS feeds from a single URL.

```bash
./gradlew sample:run --args arstechnica.com
```

Output
```
Searching for arstechnica.com
Found:
Ars Technica - All content - https://feeds.arstechnica.com/arstechnica/index
```

This is a Kotlin port of Feedbin's [FeedFinder](https://github.com/feedbin/feedbin/blob/795fe8e248ecaa52700c994dac001c92c2569a7c/app/models/feed_finder.rb) model.
