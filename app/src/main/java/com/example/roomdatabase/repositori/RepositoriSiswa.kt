package com.example.roomdatabase.repositori

import com.example.roomdatabase.data.Siswa
import kotlinx.coroutines.flow.Flow
import java.net.IDN

interface RepositoriSiswa {
    fun getAllSiswaStream():Flow<List<Siswa>>

    fun getSiswaStream(idn: Int): Flow<Siswa?>

    suspend fun InsertSiswa(siswa: Siswa)

    suspend fun deleteSiswa(siswa: Siswa)

    suspend fun updateSiswa(siswa: Siswa)
}