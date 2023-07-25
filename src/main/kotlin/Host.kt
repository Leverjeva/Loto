import kotlinx.coroutines.currentCoroutineContext
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.isActive


object Host {
    private val range = 1..90
    private val bag = range.toMutableList()


    fun takeBarrel(): Flow<Int> {
        return flow {
            try {while (currentCoroutineContext().isActive) {
                val barrel = bag.shuffled()[0]
                bag.remove(barrel)
                println(barrel)
                emit(barrel)
                }
            }catch (e: IndexOutOfBoundsException) {println ("Больше нет бочонков")}
        }
    }
}



