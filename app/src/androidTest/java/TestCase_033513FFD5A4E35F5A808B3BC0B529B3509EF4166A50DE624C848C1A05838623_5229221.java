import android.content.Context;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.RoomDatabase.Builder;
import androidx.room.migration.Migration;
import androidx.room.migration.Migration;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_033513FFD5A4E35F5A808B3BC0B529B3509EF4166A50DE624C848C1A05838623_5229221 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      Builder var3 = Room.databaseBuilder(var2, RoomDatabase.class, "database.db");
      Object var1 = EasyMock.createMock(Migration[].class);
      var3.addMigrations((Migration[])var1);
   }
}
