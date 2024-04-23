package br.senai.sp.jandira.mytrips.repository

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.BeachAccess
import androidx.compose.material.icons.filled.DownhillSkiing
import androidx.compose.material.icons.filled.Landscape
import androidx.compose.runtime.Composable
import br.senai.sp.jandira.mytrips.model.Categories

class CategoriesRepository {

    @Composable
    fun listarTodasAsCategorias(): List<Categories>{
        val montain = Categories()
        montain.id=1
        montain.icon= Icons.Default.Landscape
        montain.descricaoIcon="Montain"

        val snow = Categories()
        snow.id=2
        snow.icon= Icons.Default.DownhillSkiing
        snow.descricaoIcon="Snow"

        val beach = Categories()
        beach.id=3
        beach.icon= Icons.Default.BeachAccess
        beach.descricaoIcon="Beach"

        val categorias= listOf(montain,snow,beach)

        return categorias

    }
}