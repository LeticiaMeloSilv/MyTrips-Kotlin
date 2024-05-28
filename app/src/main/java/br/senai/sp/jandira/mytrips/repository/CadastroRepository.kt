package br.senai.sp.jandira.mytrips.repository

import android.content.Context
import br.senai.sp.jandira.mytrips.dao.CadastroDb
import br.senai.sp.jandira.mytrips.model.Cadastro

class CadastroRepository(context: Context) {

    private val db = CadastroDb.getBancoDeDados(context).CadastroDao()

    fun cadastrar(cadastrar: Cadastro): Long{
        return db.cadastrar(cadastrar)
    }

    fun logar(email: String, senha: String): Cadastro{
        return db.logar(email, senha)
    }
}