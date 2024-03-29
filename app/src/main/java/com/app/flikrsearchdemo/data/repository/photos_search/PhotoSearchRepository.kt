package com.app.flikrsearchdemo.data.repository.photos_search

import com.app.flikrsearchdemo.data.repository.photos_search.response.SearchResultResponse
import io.reactivex.Single

/**
 * Created by Your name on 2019-11-05.
 */
interface PhotoSearchRepository {

    fun queryImage(page: Int, query: String): Single<SearchResultResponse>
}