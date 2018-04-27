package uk.ac.tees.com2060.froyo.ent_froyo

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import android.widget.Button
import android.widget.ListView
import com.google.firebase.database.*
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.app_bar_main2.*
import uk.ac.tees.com2060.froyo.ent_froyo.Listings_Activity
import com.google.firebase.database.FirebaseDatabase




class HomeActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener
    {



        var listView: ListView? = null
        private val adapter: listings_data? = null

        fun onClick(view: View)
        {
            val intent=Intent(this,LoginActivity::class.java)
            startActivity(intent);


            }







        override fun onCreate(savedInstanceState: Bundle?)
        {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main2)

            setSupportActionBar(toolbar)


            fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()


            }


        val toggle = ActionBarDrawerToggle(
                this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)
        }






    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main2, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        when (item.itemId) {
            R.id.action_settings -> return true

            else -> return super.onOptionsItemSelected(item)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.

        when (item.itemId) {
            R.id.list_listings ->
            {
                val intent = Intent(this, Listings_Activity::class.java)
                startActivity(intent)

            }
            R.id.list_Job->
            {


            }
            R.id.list_deliveries ->
            {



            }
            R.id.list_account ->
            {
                val intent=Intent(this, LoginActivity::class.java)
                startActivity(intent)

            }
            R.id.list_reviews ->
            {


            }
            R.id.list_settings ->
            {


            }
            else -> {}
        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }






}
