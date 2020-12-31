import android.animation.Keyframe;
import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5AFE69779BC60E493C967C591724EECC9349BC15929F7B1EB159233A29C249A9_1549180607 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Property.class);
      Object var1 = EasyMock.createMock(Keyframe[].class);
      PropertyValuesHolder.ofKeyframe((Property)var0, (Keyframe[])var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
