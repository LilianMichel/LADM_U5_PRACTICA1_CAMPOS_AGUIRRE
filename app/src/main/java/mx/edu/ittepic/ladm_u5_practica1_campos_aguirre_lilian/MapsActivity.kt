package mx.edu.ittepic.ladm_u5_practica1_campos_aguirre_lilian

import android.Manifest
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ActivityCompat
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    lateinit var  UbicacionCliente : FusedLocationProviderClient

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
                .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)


        if(ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)!= PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.ACCESS_FINE_LOCATION),1)
        }
        UbicacionCliente = LocationServices.getFusedLocationProviderClient(this)
    }

    override fun onRequestPermissionsResult(
            requestCode: Int,
            permissions: Array<out String>,
            grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == 1){
            setTitle("SE OTROGO PERMISO")
        }
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap


        val entradaPeatonal = LatLng(21.477002, -104.866542)
        mMap.addMarker(MarkerOptions().position(entradaPeatonal).title("Entrada ITT"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(entradaPeatonal))

        val entradaLagos = LatLng(21.482477, -104.865847)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(entradaLagos).title("Entrada Lagos del Country"))

        val entradaInsurgentes = LatLng(21.476548, -104.865173)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(entradaInsurgentes).title("Entrada de automoviles Insurgentes"))

        val entrada2Agosto = LatLng(21.479379, -104.867289)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(entrada2Agosto).title("Entrada de automoviles 2 de Agosto"))

        val salonesCB = LatLng(21.477702, -104.867212)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(salonesCB).title("Edificio B Salones Ciencias Basicas-El Baston-"))

        val oficinasCB = LatLng(21.477549, -104.866657)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(oficinasCB).title("Edificio B Oficinas Ciencias Basicas-El Baston-"))

        val bañosCB = LatLng(21.477661, -104.866514)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(bañosCB).title("Edificio B Baños Ciencias Basicas-El Baston-"))

        val labComputo = LatLng(21.477661, -104.866514)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(labComputo).title("Laboratorio de Computación"))

        val estacionamientoAutosITT = LatLng(21.477804, -104.867766)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(estacionamientoAutosITT).title("Estacionamiento exclusivo autos ITT"))

        val uvp = LatLng(21.478181, -104.867739)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(uvp).title("Edificio UVP-Lenguajes extranjeras"))

        val liia = LatLng(21.478842, -104.867545)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(liia).title("Edificio  LIIA"))

        val rotondaTitulado = LatLng(21.478567, -104.866744)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(rotondaTitulado).title("Rotonda del Titulado"))

        val salonArqui = LatLng(21.478619, -104.866904)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(salonArqui).title("Nuevo Salon de Arquitectura"))

        val labCivil = LatLng(21.479064, -104.866747)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(labCivil).title("Laboratorio de Ing. Civil"))

        val labElectrica = LatLng(21.479010, -104.866615)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(labElectrica).title("Laboratorio de Ing. Electrica/Mecatronica"))

        val ud = LatLng(21.477789, -104.865944)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(ud).title("Edificio UD"))

        val licbi = LatLng(21.479597, -104.866992)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(licbi).title("Edificio LICBI"))

        val s = LatLng(21.47868, -104.866302)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(s).title("Edificio S"))

        val j = LatLng(21.479125, -104.866252)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(j).title("Edificio J y Papeleria"))

        val oficinasCoordi = LatLng(21.478690, -104.866253)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(oficinasCoordi).title("Oficinas Coordinadores"))

        val comedor = LatLng(21.478861, -104.866200)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(comedor).title("Comedor ITT"))

        val recursosFinancieros = LatLng(21.478549, -104.865630)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(recursosFinancieros).title("Departamento de recursos financieros"))

        val centroInformacion = LatLng(21.478579, -104.865170)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(centroInformacion).title("Centro de Informacion ITT"))

        val h = LatLng(21.479317, -104.866127)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(h).title("Edificio H"))

        val k = LatLng(21.478829, -104.866189)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(k).title("Edificio K"))

        val x = LatLng(21.478884, -104.865135)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(x).title("Edificio X"))

        val n = LatLng(21.478757, -104.864778)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(n).title("Edificio N"))

        val l = LatLng(21.478977, -104.865704)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(l).title("Edificio L"))

        val a = LatLng(21.479073, -104.864933)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(a).title("Edificio A"))

        val bañosG = LatLng(21.479158, -104.865333)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(bañosG).title("Baños G"))

        val g = LatLng(21.479105, -104.864936)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(g).title("Edificio G"))

        val labQuimica = LatLng(21.479213, -104.865470)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(labQuimica).title("Laboratorio de Quimica"))

        val bañosKiosko = LatLng(21.479096, -104.866047)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(bañosKiosko).title("Baños Kiosko"))

        val Kiosko = LatLng(21.479337, -104.865784)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(Kiosko).title("Kiosko ITT"))

        val materialConstru = LatLng(21.479268, -104.865617)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(materialConstru).title("Bodega de material para Ing. Civil"))

        val imagenTEC = LatLng(21.479370, -104.865440)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(imagenTEC).title("Imagen TEC"))

        val audiovisual = LatLng(21.479525, -104.865784)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(audiovisual).title("Audiovisual"))

        val tallerArqui = LatLng(21.478362, -104.864633)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(tallerArqui).title("Taller Arquitectura"))

        val oficinasBioquimica = LatLng(21.479672, -104.866100)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(oficinasBioquimica).title("Oficinas de Bioquimica/Quimica"))

        val labBioquimica = LatLng(21.479722, -104.865741)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(labBioquimica).title("Laboratorio de Bioquimica"))

        val tallerIndustrial = LatLng(21.479939, -104.866280)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(tallerIndustrial).title("Taller Ing. Industrial"))

        val bodegaFootball = LatLng(21.479862, -104.865271)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(bodegaFootball).title("Bodega de material TIGRES"))

        val bodegaBanda = LatLng(21.479986, -104.865220)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(bodegaBanda).title("Bodega de material Banda de Guerra"))

        val q = LatLng(21.479557, -104.865019)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(q).title("Edificio Q"))

        val salonesQuimica = LatLng(21.479223, -104.864711)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(salonesQuimica).title("Salones Quimica"))

        val salonesBioquimica = LatLng(21.479360, -104.865084)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(salonesBioquimica).title("Salones Bioquimica"))

        val cancha1 = LatLng(21.480059, -104.864185)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(cancha1).title("Cancha 1"))

        val cancha2 = LatLng(21.481281, -104.863562)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(cancha2).title("Cancha 2"))

        val cancha3 = LatLng(21.480419, -104.864855)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(cancha3).title("Cancha 3"))

        val cancha4 = LatLng(21.480609, -104.866011)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(cancha4).title("Cancha 4"))

        val canchaBeis = LatLng(21.481640, -104.864431)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(canchaBeis).title("Cancha Beisbol"))

        val domo = LatLng(21.481058, -104.865244)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(domo).title("DOMO ITT"))

        val canchaPlaya = LatLng(21.480355, -104.865495)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(canchaPlaya).title("CANCHA PLAYA"))

        val bañosIGE = LatLng(21.478967, -104.864749)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(bañosIGE).title("BAÑOS IGE"))

        val segundoLabQuimica = LatLng(21.479049, -104.864745)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(segundoLabQuimica).title("Segundo Laboratorio Quimica"))

        val plazaPrincipal = LatLng(21.478747, -104.865617)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(plazaPrincipal).title("Plaza Principal"))

        val bañosLab = LatLng(21.478162, -104.867211)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(bañosLab).title("Baños Laboratorio de Computo"))

        val bañosBiblio = LatLng(21.478506, -104.865339)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(bañosBiblio).title("Baños Biblioteca"))

        val centroCopiado = LatLng(21.478567, -104.865296)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(centroCopiado).title("Centro de Copiado"))

        val videoteca = LatLng(21.478692, -104.865270)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(videoteca).title("Videoteca"))

        val salaDescanso = LatLng(21.478470, -104.865240)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(salaDescanso).title("Sala de descanso"))

        val biblioteca = LatLng(21.478597, -104.865111)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(biblioteca).title("Biblioteca"))

        val centroInfo = LatLng(21.478537, -104.865766)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(centroInfo).title("Centro de Informacion"))

        val Direccion = LatLng(21.478642, -104.865720)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(Direccion).title("Direccion"))

        val subDireccion = LatLng(21.478495, -104.865557)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(subDireccion).title("SubDireccion"))

        val becas = LatLng(21.478597, -104.865586)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(becas).title("Informacion BECAS"))

        val salaJuntas = LatLng(21.478502, -104.865699)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(salaJuntas).title("Sala de Juntas"))

        val bañosAdministrativos = LatLng(21.478500, -104.865755)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(bañosAdministrativos).title("Baños Edificio Adminsitrativo"))

        val titulacion = LatLng(21.478554, -104.865530)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(titulacion).title("Documentacion Titulacion"))

        val OficinaIdiomas = LatLng(21.478112, -104.867728)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(OficinaIdiomas).title("Oficina de Idiomas"))

        val tercerLabQuimica = LatLng(21.478764, -104.867406)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(tercerLabQuimica).title("Laboratorio Quimica"))

        val audiovisualLICBI = LatLng(21.478764, -104.867621)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(audiovisualLICBI).title("Audiovisual"))

        val oficinaSistemas = LatLng(21.477858, -104.866028)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(oficinaSistemas).title("Oficinas Sistemas"))

        val oficinaIndustrial = LatLng(21.477798, -104.865808)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(oficinaIndustrial).title("Oficinas Industrial"))

        val oficinaElectricaMeca = LatLng(21.477683, -104.865876)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(oficinaElectricaMeca).title("Oficinas Electrica/Mecatronica"))

        val psicologia = LatLng(21.477651, -104.865800)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(psicologia).title("Psicologia"))

        val labMeca = LatLng(21.478901, -104.867634)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(labMeca).title("Laboratorio Mecatronica"))

        val elevador = LatLng(21.478958, -104.867416)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(elevador).title("Elevador"))

        val BañosLICBI = LatLng(21.478945, -104.867392)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(BañosLICBI).title("Baños LICBI"))

        val SalaGeneral = LatLng(21.478096, -104.867265)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(SalaGeneral).title("Sala General"))

        val SalaB = LatLng(21.478159, -104.867211)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(SalaB).title("Sala B"))

        val SalaA = LatLng(21.478096, -104.867058)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(SalaA).title("Sala A"))

        val SO = LatLng(21.477976, -104.867316)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(SO).title("Sistemas Operativos"))

        val CISCO = LatLng(21.477967, -104.867275)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(CISCO).title("CISCO"))

        val tallerISC = LatLng(21.477932, -104.867234 )
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f, 1f).position(tallerISC).title("tallerISC"))

        mMap.uiSettings.isZoomControlsEnabled = true
        mMap.uiSettings.isMyLocationButtonEnabled = true
        mMap.isMyLocationEnabled = true
        UbicacionCliente.lastLocation.addOnSuccessListener {
            if (it != null) {
                val posicionActual = LatLng(it.latitude, it.longitude)
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(posicionActual, 15f))
            }
        }
    }
}
