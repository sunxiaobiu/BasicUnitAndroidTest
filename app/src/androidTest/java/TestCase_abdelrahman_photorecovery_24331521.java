import android.os.IBinder;
import android.os.Parcel;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_abdelrahman_photorecovery_24331521 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(IBinder.class);
      Object var1 = EasyMock.createMock(Parcel.class);
      Object var2 = EasyMock.createMock(Parcel.class);
      ((IBinder)var3).transact(7, (Parcel)var1, (Parcel)var2, 0);
   }
}
