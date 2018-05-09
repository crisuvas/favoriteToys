package html.comguidetopicsmanifestmanifest_element.android.httpdeveloper.favoritetoys

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.android.favoritetoys.ToyBox



class MainActivity : AppCompatActivity() {

    var m_toy_list: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        m_toy_list = findViewById(R.id.tv_toy_list)

        val toyNames : Array<String> = ToyBox.toyNames
        for (toyName in toyNames) {
            m_toy_list?.append(toyName + "\n\n\n")
        }
    }
}
