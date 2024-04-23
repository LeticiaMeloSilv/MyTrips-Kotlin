package br.senai.sp.jandira.mytrips.repository

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import br.senai.sp.jandira.mytrips.R
import br.senai.sp.jandira.mytrips.model.Trips

import java.time.LocalDate

class TripsRepository {
    @Composable
    fun listarTodasAsViagens(): List<Trips>{
        val viagemLondres = Trips()
        viagemLondres.id=1
        viagemLondres.destino="Londres"
        viagemLondres.descricao="Londres, capital da Inglaterra e do Reino Unido, é uma cidade do século 21 com uma história que remonta à era romana."
        viagemLondres.dataChegada= LocalDate.of(2023,7,18)
        viagemLondres.dataPartida= LocalDate.of(2023,7,25)
        viagemLondres.imagem= painterResource(id = R.drawable.londres)

        val viagemParis = Trips()
        viagemParis.id=2
        viagemParis.destino="Paris"
        viagemParis.descricao="Paris, a capital da França, é uma importante cidade europeia e um centro mundial de arte, moda, gastronomia e cultura."
        viagemParis.dataChegada= LocalDate.of(2019,2,10)
        viagemParis.dataPartida= LocalDate.of(2019,2,1)
        viagemParis.imagem=painterResource(id = R.drawable.paris)

        val viagemPorto = Trips()
        viagemPorto.id=3
        viagemPorto.destino="Porto"
        viagemPorto.descricao="Porto é uma cidade costeira no noroeste de Portugal conhecida pelas pontes imponentes e pela produção de vinho do Porto. "
        viagemPorto.dataChegada= LocalDate.of(2012,6,9)
        viagemPorto.dataPartida= LocalDate.of(2017,4,12)
        viagemPorto.imagem=painterResource(id = R.drawable.porto)

        val viagemPernambuco = Trips()
        viagemPernambuco.id=4
        viagemPernambuco.destino="Pernambuco"
        viagemPernambuco.descricao="Pernambuco é um estado no nordeste do Brasil, no Oceano Atlântico."
        viagemPernambuco.dataChegada= LocalDate.of(2007,4,2)
        viagemPernambuco.dataPartida= LocalDate.of(2010,4,2)
        viagemPernambuco.imagem=null

        val viagens= listOf(viagemLondres, viagemParis, viagemPorto, viagemPernambuco)

        return viagens
    }
}