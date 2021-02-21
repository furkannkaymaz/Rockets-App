package com.example.rocketapp.model


import com.google.gson.annotations.SerializedName

class rocketsmodel : ArrayList<rocketsmodel.rocketsmodelItem>()
{
    data class rocketsmodelItem(
            @SerializedName("active")
            var active: Boolean? = false,
            @SerializedName("boosters")
            var boosters: Float? = 0.0f,
            @SerializedName("company")
            var company: String? = "",
            @SerializedName("cost_per_launch")
            var costPerLaunch: Float? = 0.0f,
            @SerializedName("country")
            var country: String? = "",
            @SerializedName("description")
            var description: String? = "",
            @SerializedName("diameter")
            var diameter: Diameter? = Diameter(),
            @SerializedName("engines")
            var engines: Engines? = Engines(),
            @SerializedName("first_flight")
            var firstFlight: String? = "",
            @SerializedName("first_stage")
            var firstStage: FirstStage? = FirstStage(),
            @SerializedName("height")
            var height: Height? = Height(),
            @SerializedName("id")
            var id: Float? = 0.0f,
            @SerializedName("landing_legs")
            var landingLegs: LandingLegs? = LandingLegs(),
            @SerializedName("mass")
            var mass: Mass? = Mass(),
            @SerializedName("payload_weights")
            var payloadWeights: List<PayloadWeight?>? = listOf(),
            @SerializedName("rocket_name")
            var rocketName: String? = "",
            @SerializedName("rocket_type")
            var rocketType: String? = "",
            @SerializedName("rocket_id")
            var rocketİd: String? = "",
            @SerializedName("second_stage")
            var secondStage: SecondStage? = SecondStage(),
            @SerializedName("stages")
            var stages: Float? = 0.0f,
            @SerializedName("success_rate_pct")
            var successRatePct: Float? = 0.0f,
            @SerializedName("wikipedia")
            var wikipedia: String? = ""
    )
    {
        data class Diameter(
                @SerializedName("feet")
                var feet: Float? = 0.0f,
                @SerializedName("meters")
                var meters: Float? = 0.0f
        )
    
        data class Engines(
                @SerializedName("engine_loss_max")
                var engineLossMax: Any? = Any(),
                @SerializedName("layout")
                var layout: Any? = Any(),
                @SerializedName("number")
                var number: Float? = 0.0f,
                @SerializedName("propellant_1")
                var propellant1: String? = "",
                @SerializedName("propellant_2")
                var propellant2: String? = "",
                @SerializedName("thrust_sea_level")
                var thrustSeaLevel: ThrustSeaLevel? = ThrustSeaLevel(),
                @SerializedName("thrust_to_weight")
                var thrustToWeight: Any? = Any(),
                @SerializedName("thrust_vacuum")
                var thrustVacuum: ThrustVacuum? = ThrustVacuum(),
                @SerializedName("type")
                var type: String? = "",
                @SerializedName("version")
                var version: String? = ""
        ) {
            data class ThrustSeaLevel(
                    @SerializedName("kN")
                    var kN: Float? = 0.0f,
                    @SerializedName("lbf")
                    var lbf: Float? = 0.0f
            )
    
            data class ThrustVacuum(
                    @SerializedName("kN")
                    var kN: Float? = 0.0f,
                    @SerializedName("lbf")
                    var lbf: Float? = 0.0f
            )
        }
    
        data class FirstStage(
                @SerializedName("burn_time_sec")
                var burnTimeSec: Float? = 0.0f,
                @SerializedName("engines")
                var engines: Float? = 0.0f,
                @SerializedName("fuel_amount_tons")
                var fuelAmountTons: Float? = 0.0f,
                @SerializedName("reusable")
                var reusable: Boolean? = false,
                @SerializedName("thrust_sea_level")
                var thrustSeaLevel: ThrustSeaLevel? = ThrustSeaLevel(),
                @SerializedName("thrust_vacuum")
                var thrustVacuum: ThrustVacuum? = ThrustVacuum()
        ) {
            data class ThrustSeaLevel(
                    @SerializedName("kN")
                    var kN: Float? = 0.0f,
                    @SerializedName("lbf")
                    var lbf: Float? = 0.0f
            )
    
            data class ThrustVacuum(
                    @SerializedName("kN")
                    var kN: Float? = 0.0f,
                    @SerializedName("lbf")
                    var lbf: Float? = 0.0f
            )
        }
    
        data class Height(
                @SerializedName("feet")
                var feet: Float? = 0.0f,
                @SerializedName("meters")
                var meters: Float? = 0.0f
        )
    
        data class LandingLegs(
                @SerializedName("material")
                var material: String? = "",
                @SerializedName("number")
                var number: Float? = 0.0f
        )
    
        data class Mass(
                @SerializedName("kg")
                var kg: Float? = 0.0f,
                @SerializedName("lb")
                var lb: Float? = 0.0f
        )
    
        data class PayloadWeight(
                @SerializedName("id")
                var id: String? = "",
                @SerializedName("kg")
                var kg: Float? = 0.0f,
                @SerializedName("lb")
                var lb: Float? = 0.0f,
                @SerializedName("name")
                var name: String? = ""
        )
    
        data class SecondStage(
                @SerializedName("burn_time_sec")
                var burnTimeSec: Float? = 0.0f,
                @SerializedName("engines")
                var engines: Float? = 0.0f,
                @SerializedName("fuel_amount_tons")
                var fuelAmountTons: Float? = 0.0f,
                @SerializedName("payloads")
                var payloads: Payloads? = Payloads(),
                @SerializedName("thrust")
                var thrust: Thrust? = Thrust()
        ) {
            data class Payloads(
                    @SerializedName("composite_fairing")
                    var compositeFairing: CompositeFairing? = CompositeFairing(),
                    @SerializedName("option_1")
                    var option1: String? = "",
                    @SerializedName("option_2")
                    var option2: String? = ""
            ) {
                data class CompositeFairing(
                        @SerializedName("diameter")
                        var diameter: Diameter? = Diameter(),
                        @SerializedName("height")
                        var height: Height? = Height()
                ) {
                    data class Diameter(
                            @SerializedName("feet")
                            var feet: Any? = Any(),
                            @SerializedName("meters")
                            var meters: Any? = Any()
                    )
    
                    data class Height(
                            @SerializedName("feet")
                            var feet: Any? = Any(),
                            @SerializedName("meters")
                            var meters: Any? = Any()
                    )
                }
            }
    
            data class Thrust(
                    @SerializedName("kN")
                    var kN: Float? = 0.0f,
                    @SerializedName("lbf")
                    var lbf: Float? = 0.0f
            )
        }
    }
}
