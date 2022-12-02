package com.keyvani.countryapi.di

import android.content.Context
import androidx.room.Room
import com.keyvani.countryapi.db.CountryDatabase
import com.keyvani.countryapi.db.CountryEntity
import com.keyvani.countryapi.utils.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton

    fun provideDatabase(@ApplicationContext context: Context) = Room.databaseBuilder(
        context,CountryDatabase::class.java,Constants.COUNTRIES_TABLE
    )
        .allowMainThreadQueries()
        .fallbackToDestructiveMigration()
        .build()

    @Provides
    @Singleton
    fun provideDao(db:CountryDatabase)=db.countryDao()


    @Provides
    @Singleton

    fun provideEntity() = CountryEntity()


}