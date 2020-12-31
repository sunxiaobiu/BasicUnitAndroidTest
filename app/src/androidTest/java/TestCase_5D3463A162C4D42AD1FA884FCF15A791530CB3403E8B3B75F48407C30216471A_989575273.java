import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.util.Property;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5D3463A162C4D42AD1FA884FCF15A791530CB3403E8B3B75F48407C30216471A_989575273 {
   public static void testCase() throws Exception {
      Object var0 = null;
      Object var1 = EasyMock.createMock(Property.class);
      Object var2 = EasyMock.createMock(Path.class);
      ObjectAnimator.ofObject(var0, (Property)var1, (TypeConverter)null, (Path)var2);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
