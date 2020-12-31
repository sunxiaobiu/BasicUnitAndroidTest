import android.os.IBinder;
import android.os.Parcel;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_abdelrahman_photorecovery__814095458 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Parcel.class);
      Object var1 = EasyMock.createMock(IBinder.class);
      ((Parcel)var2).writeStrongBinder((IBinder)var1);
   }
}
