import android.nfc.Tag;
import android.os.Parcel;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_10AAFC3EFDD645DD81709CAFA007A1065E52497CA9DFAD5F645EA9A10AE0F1E3_1379864113 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Tag.class);
      Object var1 = EasyMock.createMock(Parcel.class);
      ((Tag)var2).writeToParcel((Parcel)var1, 0);
   }
}
