import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_10AAFC3EFDD645DD81709CAFA007A1065E52497CA9DFAD5F645EA9A10AE0F1E3__2085993195 {
   @Test
   public void testCase() throws Exception {
      Parcel var2 = Parcel.obtain();
      Object var1 = EasyMock.createMock(Bundle[].class);
      var2.writeTypedArray((Parcelable[])var1, 0);
   }
}
