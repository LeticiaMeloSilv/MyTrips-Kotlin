package br.senai.sp.jandira.mytrips.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import br.senai.sp.jandira.mytrips.model.Cadastro

@Dao
interface CadastroDao {

    @Insert
    fun cadastrar(cadastrar: Cadastro): Long

    @Query("SELECT * FROM tbl_cadastro WHERE email = :email AND senha = :senha")
    fun logar(email: String, senha: String): Cadastro


}