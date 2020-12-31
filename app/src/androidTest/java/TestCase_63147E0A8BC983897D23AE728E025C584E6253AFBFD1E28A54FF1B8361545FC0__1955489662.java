import android.content.Context;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.RoomDatabase.Builder;
import androidx.room.RoomDatabase.Callback;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_63147E0A8BC983897D23AE728E025C584E6253AFBFD1E28A54FF1B8361545FC0__1955489662 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      Builder var3 = Room.databaseBuilder(var2, RoomDatabase.class, "sample-db");
      Object var1 = EasyMock.createMock(Callback.class);
      var3.addCallback((Callback)var1);
   }
}
