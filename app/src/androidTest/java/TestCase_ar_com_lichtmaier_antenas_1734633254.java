import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ar_com_lichtmaier_antenas_1734633254 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(MutableLiveData.class);
      Object var1 = null;
      Transformations.switchMap((LiveData)var0, (Function)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
