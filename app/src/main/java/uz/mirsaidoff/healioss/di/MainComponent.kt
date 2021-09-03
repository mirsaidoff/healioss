package uz.mirsaidoff.healioss.di

import dagger.Component
import uz.mirsaidoff.healioss.ui.DetailsFragment
import uz.mirsaidoff.healioss.ui.MainFragment

@Component(modules = [NetworkModule::class])
interface MainComponent {
    fun inject(fragment: MainFragment)
    fun inject(fragment: DetailsFragment)
}