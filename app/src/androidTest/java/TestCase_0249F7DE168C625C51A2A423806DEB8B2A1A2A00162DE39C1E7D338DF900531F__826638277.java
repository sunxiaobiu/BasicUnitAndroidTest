import android.content.res.TypedArray;
import android.util.TypedValue;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_0249F7DE168C625C51A2A423806DEB8B2A1A2A00162DE39C1E7D338DF900531F__826638277 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(TypedArray.class);
      byte var1 = 1;
      Object var2 = EasyMock.createMock(TypedValue.class);
      ((TypedArray)var3).getValue(var1, (TypedValue)var2);
   }
}
