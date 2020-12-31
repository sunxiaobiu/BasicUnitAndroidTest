import android.animation.Keyframe;
import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_0249F7DE168C625C51A2A423806DEB8B2A1A2A00162DE39C1E7D338DF900531F_234925392 {
   public static void testCase() throws Exception {
      String var0 = "android";
      Object var1 = EasyMock.createMock(Keyframe[].class);
      PropertyValuesHolder.ofKeyframe(var0, (Keyframe[])var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
