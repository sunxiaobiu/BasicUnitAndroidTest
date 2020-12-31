import android.support.v4.util.LongSparseArray;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_serviceseeking_business_android_85681327 {
   @Test
   public void testCase() throws Exception {
      Object var4 = EasyMock.createMock(LongSparseArray.class);
      byte var3 = 1;
      ((LongSparseArray)var4).keyAt(var3);
   }
}
