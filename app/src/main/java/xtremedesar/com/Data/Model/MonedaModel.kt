package xtremedesar.com.Data.Model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class MonedaModel(
    var Id      : String? = null,
    var Nombre  : String? = null,
    var Pais    : String? = null,
    var Simbolo : String? = null
): Serializable
