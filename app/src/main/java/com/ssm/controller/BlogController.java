package com.ssm.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.pojo.Blog;
import com.ssm.service.IBlogService;
import com.ssm.utils.PageInfo;

@Controller
@RequestMapping("/blog")
public class BlogController {
	@Autowired
	private IBlogService blogService;
	
	//page 信息放在这里
	private PageInfo pageInfo = new PageInfo(0);
	
	
  @InitBinder
  protected void initBinder(WebDataBinder binder) 
  {
      SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
      dateFormat.setLenient(false);
      binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
  }
	
	
	//文章的标题，大概内容
	@RequestMapping(value="/show")
	public String show(Model model)
	{
//		Blog blog = blogService.findById(1);
//		System.out.println(blog.getContent());
//		System.out.println(pageInfo.getBeginIndex());
//		System.out.println(pageInfo.getCurrentPage());
//		System.out.println(pageInfo.getPageSize());
		model.addAttribute("pageInfo", pageInfo);
		model.addAttribute("pageInfo",pageInfo);
		List<Blog> blogs = blogService.getBlogPage(0, pageInfo.getPageSize());
		model.addAttribute("blogs", blogs);
		return "blogMainPage"; 
	}
	@RequestMapping(value="/show/{page}")
	public String show(Model model,@PathVariable int page)
	{
//		Blog blog = blogService.findById(1);
//		System.out.println(blog.getContent());
		pageInfo.setCurrentPage(page);
		model.addAttribute("pageInfo",pageInfo);
		List<Blog> blogs = blogService.getBlogPage(page*pageInfo.getPageSize(), pageInfo.getPageSize());
		model.addAttribute("blogs", blogs);
		return "blogMainPage"; 
	}
	//创建新文章
	@RequestMapping("/writeBlog")
	public String writeBlog(Model model)
	{	
		Blog blog = null;
		model.addAttribute("blog",blog);
		return "emptyBlogPage"; 
	}
	//编辑文章
	@RequestMapping("/editBlog/{id}")
	public String editBlog(Model model,@PathVariable int id)
	{
		Blog blog = blogService.findById(id);
		System.out.println(blog.getDate());
		model.addAttribute("blog", blog);
		model.addAttribute("test", "test is this");
		return "editBlogPage";
	}
	//删除
	@RequestMapping("/deleteBlog/{id}")
	public String deleteBlog(@PathVariable int id)
	{
		blogService.remove(id);
		return "blogMainPage";
	}
	
	
	@RequestMapping("/saveBlog")
	public String saveBlog(Blog blog)
	{
		if(blog.getId() == 0)
		{
			//设置summary 长度为40
			int length = blog.getContent().length();
			int summaryLength = length > 40 ? 40 : length;
			blog.setSummary(blog.getContent().substring(0,summaryLength));
			blog.setReadTimes(0);
			//暂时设为1
			blog.setAuthorId(1);
	        Date date = new Date();
			blog.setDate(date);
			blogService.insert(blog);
		}
		else
		{

			Blog newBlog = blogService.findById(blog.getId());
			newBlog.setContent(blog.getContent());
			newBlog.setTitle(blog.getTitle());
			blogService.update(newBlog);			
		}

		return "showBlogPage";
	}
	
	
	//这个是每个人都可以的
	//查看新文章
	@RequestMapping("/readBlog/{id}")
	public String readBlog(Model model,@PathVariable int id)
	{
		Blog blog = blogService.findById(id);
		model.addAttribute("blog", blog);
		return "showBlogPage";
	}	



//	@RequestMapping("/editBlog")
//	public String edit()
//	{
//		
//	}
	
	
	
//
//	@Autowired
//	private BlogService blogService;
//	
//
//	
////	@RequestMapping(value="/article",method=RequestMethod.GET)
////	public String getBlogById(Model model,int blogId)
////	{
////		Blog blog = blogService.findById(blogId);
////		model.addAttribute("blog",blog);
////		
//////		ModelAndView mv = new ModelAndView("index");
//////		mv.addObject("user", user);
////		return "blog";
////	}
//	
//	@RequestMapping(value="article/{id}")
//	public String getBlogById(Model model,@PathVariable("id") int blogId)
//	{
//		Blog blog = blogService.findById(blogId);
//		System.out.println(blog.getId());
//		model.addAttribute("blog",blog);
//
////		List<Comment> commentList=commentService.listComment();
////		model.addAttribute("commentList", commentList);
//		return "blog";
//	}
//	@RequestMapping(value="article/listPage/{id}")
//	public String listPage(Model model,@PathVariable("id")int pageNumber)
//	{
//		List<Blog> blogs = blogService.listPage(pageNumber);
//		model.addAttribute("allblogs",blogs);
//		
//		//以后包装一下方法，得到summary
//		//主要是字段改变，content就放地址，summary加一个
//		HashMap<Blog,String> hashmap = new HashMap<>();
//		for(Iterator<Blog> it = blogs.iterator();it.hasNext();)
//		{
//			Blog blog = it.next();
//			String summary = blog.getContent();
//			System.out.println(summary);
//			if(summary.length() > 100)
//				summary = summary.substring(0,100);
//			hashmap.put(blog, summary);
//		}
//		model.addAttribute("hashMap",hashmap);
//		
//		return "blogs";
//	}
//
////	@ResponseBody
////	@RequestMapping(value="/delete", method=RequestMethod.GET)
////	public ReturnObject deleteBlogById(int blogId){		
////		return  blogService.deleteBlog(blogId);
////	}
//	
//	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
//	public String deleteUser(@PathVariable("id") int BlogId) {
//		blogService.deleteBlog(BlogId);
//		return "blogs";
////	    return "redirect:hello2";
//	}
//	
//	
//	
//	
//	@RequestMapping(value="/add")
//	public String addBlog()
//	{
//		return "addBlog";
////	    return "redirect:hello2";
//	}
//	
//	
//	//1.暂时先这样/add/{id},但是这样id在jsp的form里面action怎么取
//	//2./add2
//	//3.
//	@ResponseBody
////	@RequestMapping(value="/add/{id}")
//	@RequestMapping(value="/add2")
//	public ReturnObject addBlog(@ModelAttribute("blog")Blog blog){		
//		return  blogService.addBlog(blog);
//	}	
//	
//	
//	
//	
//	//无法注入blog，数据虽然传递了过来
//	//只能先去除param，构造blog先
//	//而且requst里面没有 只有 requestParam 会注入
////	@RequestMapping(value = "/add3", method = RequestMethod.POST)
////	public String addBlog3(HttpServletRequest request,@RequestParam("title") String titi) {
////		System.out.print(titi);
////		System.out.print(request.getAttribute("title"));
////		return "hello2";
////	}
////	
//	@RequestMapping("/uploadFile")
//	public String uploadFile()
//	{
//		return "uploadFile";
//	}
//
//	
//	
//    @RequestMapping("/springUpload")
//    public String  springUpload(HttpServletRequest request,Model model) throws IllegalStateException, IOException
//    {
//         long  startTime=System.currentTimeMillis();
//         //将当前上下文初始化给  CommonsMutipartResolver （多部分解析器）
//        CommonsMultipartResolver multipartResolver=new CommonsMultipartResolver(
//                request.getSession().getServletContext());
//        //检查form中是否有enctype="multipart/form-data"
//        if(multipartResolver.isMultipart(request))
//        {
//            //将request变成多部分request
//            MultipartHttpServletRequest multiRequest=(MultipartHttpServletRequest)request;
//           //获取multiRequest 中所有的文件名
//            Iterator iter=multiRequest.getFileNames();
//             
//            
//           //真实路径
//			String realPath3 = request.getSession().getServletContext().getRealPath("/");
//			System.out.println(realPath3);  
//			String realPath2 = request.getSession().getServletContext().getRealPath("/WEB-INF/jsp/");
//			System.out.println(realPath2);  
//
//            
//            while(iter.hasNext())
//            {
//                //一次遍历所有文件
//                MultipartFile file=multiRequest.getFile(iter.next().toString());
//                if(file!=null)
//                {
//        			String realPath = request.getSession().getServletContext().getRealPath("/WEB-INF/upload/");
//                    System.out.println(realPath);
//
//                    String path=realPath+file.getOriginalFilename();
//                    System.out.println(path);
//                    
//                    String aa = file.getOriginalFilename();
//                    model.addAttribute("aa");
//                    
//                    //上传
//                    file.transferTo(new File(path));
//                }
//                 
//            }
//           
//        }
//        long  endTime=System.currentTimeMillis();
//        System.out.println("运行时间："+String.valueOf(endTime-startTime)+"ms");
//        return "list"; 
//    }
//	
//    @RequestMapping("/springUpload2")
//    public String handleFormUpload(@RequestParam("file") MultipartFile file,HttpServletRequest request) throws IllegalStateException, IOException{
//
//        if (!file.isEmpty()) {  
//            try {  
//                // 文件保存路径  
//                String filePath = request.getSession().getServletContext().getRealPath("/WEB-INF/upload/")+ file.getOriginalFilename();  
//                System.out.println(filePath);
//                // 转存文件  
//                file.transferTo(new File(filePath));  
//            } catch (Exception e) {  
//                e.printStackTrace();  
//            }  
//        }  
//        return "list";
//    }
//    
//    @RequestMapping("/listlist")
//    public String testList(HttpServletRequest request)
//    {
//		String realPath = request.getSession().getServletContext().getRealPath("/");
//		System.out.println(realPath);  
//		String realPath2 = request.getSession().getServletContext().getRealPath("/WEB-INF/jsp/");
//		System.out.println(realPath2);  
//    	
//    	return "list";
//    }
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//
//	
//    @InitBinder
//    protected void initBinder(WebDataBinder binder) 
//    {
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        dateFormat.setLenient(false);
//        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
//    }
//    
//	@RequestMapping(value = "/add3", method = RequestMethod.POST)
//	public String addBlog3(@ModelAttribute("blog")Blog blog) {
//		blogService.addBlog(blog);
//		return "blogs";
//	}
//	
//	
//	
//	
////	@ResponseBody
////	@RequestMapping(value="/add")
////	public ReturnObject addBlog(Blog blog){		
////		return  blogService.addBlog(blog);
////	}	
//	
//	
////	@ResponseBody
////	@RequestMapping(value="/update", method=RequestMethod.GET)
////	public ReturnObject update(Blog blog){		
////		return  blogService.update(blog);
////	}
//
//	@RequestMapping(value="/update/{id}")
//	public String updateBlog(Model model,@PathVariable("id") int blogId)
//	{
//		Blog blog = blogService.findById(blogId);
//		System.out.println(blog.getId());
//		model.addAttribute("blog",blog);
//		
//		return "updateBlog";
//	}	
//	
//
//	
//	//直接访问，会丢失一个blog id 可能会有错误 ， 暂时没有去解决
//	@RequestMapping(value = "/update2", method = RequestMethod.POST)
//	public String updateBlog2(@ModelAttribute("blog")Blog blog) {
//		System.out.println(blog.getId());
//		System.out.println(blog.getTitle());
//
//		blogService.update(blog);
//		return "blogs";
//	}
//		
//	
//
//	@RequestMapping(value="/allArticle")
//	public String getAllBlog(Model model)
//	{
//		List<Blog> blogs = blogService.listBlog();
//		model.addAttribute("allblogs",blogs);
//		return "blogs";
//	}
//	
////	@RequestMapping(value="/selectedArticle",method=RequestMethod.GET)
////	public String getAllBlog(Model model,String type)
////	{
//////		List<Blog> blogs = blogService.listBlog();
//////		model.addAttribute("allblogs",blogs);
//////		return "blogs";
////		
////		List<Integer> blogsId = blogTypeService.selectByType(type);
////		List<Blog> blogs = new ArrayList<>();
////        Iterator it1 = blogsId.iterator();
////		while(it1.hasNext())
////		{
////			int blogid = (int)it1.next();
////			blogs.add(blogService.findById(blogid));
////		}
////		model.addAttribute("selectblogs",blogs);
////		return "selectedBlog";
////	}
}
