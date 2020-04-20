package com.coinpaprika.apiclient.repository.ticker

import com.coinpaprika.apiclient.entity.TickerEntity
import com.coinpaprika.apiclient.exception.NetworkConnectionException
import com.coinpaprika.apiclient.exception.ServerConnectionError
import com.coinpaprika.apiclient.exception.TooManyRequestsError
import io.reactivex.Observable
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.ResponseBody
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import retrofit2.Response
import org.mockito.junit.MockitoJUnitRunner
import org.mockito.BDDMockito.given


//@RunWith(MockitoJUnitRunner::class)
class TickerApiTest {

//    @Mock private lateinit var mockApi: TickerApiContract
//    @Mock lateinit var mockTicker: TickerEntity
// TODO rewrite tests for coroutines
//    @Test
//    fun `get ticker happy case`() {
//        val ticker = mockTicker
//        val response = Response.success(ticker)
//
//        `when`(mockApi.getTicker(FAKE_CRYPTOCURRENCY_ID))
//            .thenReturn(Observable.just(response))
//
//        val client = TickerApi(mockApi)
//        client.getTicker(FAKE_CRYPTOCURRENCY_ID)
//            .map { it.body() }
//            .test()
//            .assertResult(ticker)
//            .assertComplete()
//    }
//
//    @Test
//    fun `get tickers happy case`() {
//        val tickerEntityList = listOf(mockTicker)
//        val response = Response.success(tickerEntityList)
//
//        `when`(mockApi.getTickers())
//            .thenReturn(Observable.just(response))
//
//        val client = TickerApi(mockContext, mockApi)
//        client.getTickers()
//            .map { it.body() }
//            .test()
//            .assertResult(tickerEntityList)
//            .assertComplete()
//    }
//
//    @Test
//    fun `get ticker too many requests error`() {
//        val response = Response.error<TickerEntity>(429,
//            ResponseBody.create("application/json".toMediaType(), "\"error\":\"too many requests\")"))
//
//        `when`(mockApi.getTicker(FAKE_CRYPTOCURRENCY_ID))
//            .thenReturn(Observable.just(response))
//
//        val client = TickerApi(mockContext, mockApi)
//        client.getTicker(FAKE_CRYPTOCURRENCY_ID)
//            .test()
//            .assertError(TooManyRequestsError::class.java)
//            .assertNotComplete()
//    }
//
//    @Test
//    fun `get tickers too many requests error`() {
//        val response = Response.error<List<TickerEntity>>(429,
//            ResponseBody.create("application/json".toMediaType(), "\"error\":\"too many requests\")"))
//
//        `when`(mockApi.getTickers())
//            .thenReturn(Observable.just(response))
//
//        val client = TickerApi(mockContext, mockApi)
//        client.getTickers()
//            .test()
//            .assertError(TooManyRequestsError::class.java)
//            .assertNotComplete()
//    }
//
//    @Test
//    fun `get ticker server error`() {
//        val response = Response.error<TickerEntity>(404,
//            ResponseBody.create("application/json".toMediaType(), ""))
//
//        `when`(mockApi.getTicker(FAKE_CRYPTOCURRENCY_ID))
//            .thenReturn(Observable.just(response))
//
//        val client = TickerApi(mockContext, mockApi)
//        client.getTicker(FAKE_CRYPTOCURRENCY_ID)
//            .test()
//            .assertError(ServerConnectionError::class.java)
//            .assertNotComplete()
//    }
//
//    @Test
//    fun `get tickers server error`() {
//        val response = Response.error<List<TickerEntity>>(404,
//            ResponseBody.create("application/json".toMediaType(), ""))
//
//        `when`(mockApi.getTickers())
//            .thenReturn(Observable.just(response))
//
//        val client = TickerApi(mockContext, mockApi)
//        client.getTickers()
//            .test()
//            .assertError(ServerConnectionError::class.java)
//            .assertNotComplete()
//    }
//
//    @Test
//    fun `get ticker network connection error`() {
//        given(mockApi.getTicker(FAKE_CRYPTOCURRENCY_ID))
//            .willAnswer {
//                throw NetworkConnectionException()
//            }
//
//        val client = TickerApi(mockContext, mockApi)
//        client.getTicker(FAKE_CRYPTOCURRENCY_ID)
//            .test()
//            .assertError(NetworkConnectionException::class.java)
//            .assertNotComplete()
//    }
//
//    @Test
//    fun `get tickers network connection error`() {
//        given(mockApi.getTickers())
//            .willAnswer {
//                throw NetworkConnectionException()
//            }
//
//        val client = TickerApi(mockContext, mockApi)
//        client.getTickers()
//            .test()
//            .assertError(NetworkConnectionException::class.java)
//            .assertNotComplete()
//    }

    companion object {
        private const val FAKE_CRYPTOCURRENCY_ID = "btc-bitcoin"
    }
}