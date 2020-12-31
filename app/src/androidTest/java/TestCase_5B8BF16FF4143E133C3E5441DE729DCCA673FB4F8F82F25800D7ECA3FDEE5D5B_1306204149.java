import android.content.Context;
import android.support.v4.util.LongSparseArray;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import java.util.WeakHashMap;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5B8BF16FF4143E133C3E5441DE729DCCA673FB4F8F82F25800D7ECA3FDEE5D5B_1306204149 {
   @Test
   public void testCase() throws Exception {
      WeakHashMap var4 = new WeakHashMap(0);
      Context var1 = InstrumentationRegistry.getTargetContext();
      Object var5 = var4.get(var1);
      LongSparseArray var6 = (LongSparseArray)var5;
      long var2 = 1L;
      var6.delete(var2);
   }
}
