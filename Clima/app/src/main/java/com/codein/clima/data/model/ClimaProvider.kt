package com.codein.clima.data.model


class ClimaProvider {

    companion object
    {
        //variable clima de tipo ClimaRpModel sea igual a un vacio
        var clima : ClimaRpModel = ClimaRpModel(coord = ClimaRpModel.Coord(), weather = emptyList(), main = ClimaRpModel.Main())
    }
}