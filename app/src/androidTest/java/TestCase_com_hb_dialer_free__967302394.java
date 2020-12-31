import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_hb_dialer_free__967302394 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Parcel.class);
      Object var1 = EasyMock.createMock(Parcelable[].class);
      ((Parcel)var2).writeParcelableArray((Parcelable[])var1, 0);
   }
}
