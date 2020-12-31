import android.os.Parcel;
import android.text.TextUtils;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_442AA57E3F134A3BFB5DF11C5A535016DAC52A181915B53DBC074656BDB08C30_112456902 {
   public static void testCase() throws Exception {
      Object var0 = null;
      Object var1 = EasyMock.createMock(Parcel.class);
      TextUtils.writeToParcel((CharSequence)var0, (Parcel)var1, 1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
