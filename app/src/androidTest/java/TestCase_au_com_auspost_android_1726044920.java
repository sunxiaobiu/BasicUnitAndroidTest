import android.os.Parcel;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_auspost_android_1726044920 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Parcel.class);
      byte[] var2 = ((Parcel)var1).createByteArray();
   }
}
