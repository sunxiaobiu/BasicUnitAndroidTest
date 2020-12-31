import android.content.res.Configuration;
import android.os.Parcel;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_hamsterbeat_wallpapers_fx_panorama__1365354678 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Configuration.class);
      Object var1 = EasyMock.createMock(Parcel.class);
      ((Configuration)var2).writeToParcel((Parcel)var1, 0);
   }
}
