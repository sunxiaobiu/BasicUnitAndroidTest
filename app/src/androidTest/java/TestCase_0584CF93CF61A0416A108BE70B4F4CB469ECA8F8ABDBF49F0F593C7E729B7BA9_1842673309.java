import android.content.res.ColorStateList;
import android.widget.ImageView;
import androidx.core.widget.ImageViewCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_0584CF93CF61A0416A108BE70B4F4CB469ECA8F8ABDBF49F0F593C7E729B7BA9_1842673309 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(ImageView.class);
      Object var1 = EasyMock.createMock(ColorStateList.class);
      ImageViewCompat.setImageTintList((ImageView)var0, (ColorStateList)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
