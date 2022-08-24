package space.rybakov.meringueosm.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface PointDao {
    @Query("SELECT * FROM PointEntity ORDER BY id DESC")
    fun getAll(): LiveData<List<PointEntity>>

    @Insert
    fun insert(post: PointEntity)

    @Query("DELETE FROM PointEntity WHERE id = :id")
    fun removeById(id: Long)
}