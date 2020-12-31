import android.os.Parcel;
import androidx.test.runner.AndroidJUnit4;
import java.io.Serializable;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_corrigo_enterprise__1223474835 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Parcel.class);
      Object var1 = null;
      ((Parcel)var2).writeSerializable((Serializable)var1);
   }
}
