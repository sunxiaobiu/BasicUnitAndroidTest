import android.graphics.Bitmap;
import android.os.Parcel;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_angryrobot_wikicamps__1820654423 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Bitmap.class);
      Object var1 = EasyMock.createMock(Parcel.class);
      ((Bitmap)var2).writeToParcel((Parcel)var1, 0);
   }
}
