package vn.udn.vku.nhhai.exercise2_uedn4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    val countrySource = listOf<CountryInfo>(
        CountryInfo("Viet Nam",96.5,R.drawable.vietnam),
        CountryInfo("Korea",61.2,R.drawable.korea),
        CountryInfo("Japan",105.7,R.drawable.japan),
        CountryInfo("Laos",12.4,R.drawable.laos),
        CountryInfo("Thailand",65.9,R.drawable.thailand)
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val countryListView = findViewById<ListView>(R.id.countryLV)
        val countryAdapter = CountryAdapter(this,countrySource)
        countryListView.adapter = countryAdapter
    }
}