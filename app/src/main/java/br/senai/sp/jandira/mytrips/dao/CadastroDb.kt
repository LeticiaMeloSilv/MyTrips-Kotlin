package br.senai.sp.jandira.mytrips.dao

import android.content.Context
import androidx.compose.material3.CardDefaults
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import br.senai.sp.jandira.mytrips.model.Cadastro

@Database(entities = [Cadastro::class], version = 1)
abstract class CadastroDb(): RoomDatabase(){
    abstract fun CadastroDao(): CadastroDao

    companion object{
        private lateinit var instancia: CadastroDb

        fun getBancoDeDados(context: Context): CadastroDb{
            instancia = Room
                .databaseBuilder(
                    context,
                    CadastroDb::class.java,
                    "db_mytrips"
                )
                .allowMainThreadQueries()
                .fallbackToDestructiveMigration()
                .build()
            return instancia
        }
    }
}