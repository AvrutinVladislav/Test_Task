package com.example.testtask.data

import com.squareup.moshi.Moshi
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton
import kotlin.jvm.internal.Intrinsics

object DataDiModule {
    @Provides
    @Singleton
    fun provideRetrofitClient(
            okHttpClient: OkHttpClient,
            moshi: Moshi,
    ): Retrofit {
        return Retrofit.Builder()
                .client(okHttpClient)
                .addConverterFactory(MoshiConverterFactory.create(moshi))
                .build()
    }

    @Provides
    @Singleton
    fun provideMoshi() = MoshiConverterFactory.create()

    @Provides
    @Singleton
    fun provideOkHttpClient(interceptor: HttpLoggingInterceptor): OkHttpClient {
        return OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .build()
    }

    @Provides
    @Singleton
    fun provideHttpInterseptor() = HttpLoggingInterceptor().apply { this.level = HttpLoggingInterceptor.Level.BASIC }


}

