package dev.estudos.calculadoraimc.model

data class Resultado ( val imc: Double ) {
    val tipoResultado: TipoResultado = verificarIMC(imc)

    private fun verificarIMC(resultPesoDouble: Double): TipoResultado {
        return when (resultPesoDouble) {
            in 0.00 .. 17.00 -> TipoResultado.MAGREZA
            in 17.0 .. 18.5 -> TipoResultado.ABAIXO_DO_PESO
            in 18.5 .. 25.0 -> TipoResultado.PESO_IDEAL
            in 25.0 .. 30.0 -> TipoResultado.SOBREPESO
            else -> TipoResultado.OBESIDADE
        }
    }

}