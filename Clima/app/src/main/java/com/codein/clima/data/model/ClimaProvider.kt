package com.codein.clima.data.model


class ClimaProvider {

    companion object
    {
        var clima : ClimaRpModel = ClimaRpModel(coord = ClimaRpModel.Coord(), weather = emptyList(), main = ClimaRpModel.Main())
    }
}