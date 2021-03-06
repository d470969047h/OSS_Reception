USE [master]
GO
/****** Object:  Database [oss]    Script Date: 2015-01-04 15:18:58 ******/
CREATE DATABASE [oss]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'oss', FILENAME = N'D:\SQL Server 2012\MSSQL11.MSSQLSERVER\MSSQL\DATA\oss.mdf' , SIZE = 178176KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'oss_log', FILENAME = N'D:\SQL Server 2012\MSSQL11.MSSQLSERVER\MSSQL\DATA\oss_log.ldf' , SIZE = 57664KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [oss] SET COMPATIBILITY_LEVEL = 110
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [oss].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [oss] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [oss] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [oss] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [oss] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [oss] SET ARITHABORT OFF 
GO
ALTER DATABASE [oss] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [oss] SET AUTO_CREATE_STATISTICS ON 
GO
ALTER DATABASE [oss] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [oss] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [oss] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [oss] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [oss] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [oss] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [oss] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [oss] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [oss] SET  DISABLE_BROKER 
GO
ALTER DATABASE [oss] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [oss] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [oss] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [oss] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [oss] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [oss] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [oss] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [oss] SET RECOVERY FULL 
GO
ALTER DATABASE [oss] SET  MULTI_USER 
GO
ALTER DATABASE [oss] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [oss] SET DB_CHAINING OFF 
GO
ALTER DATABASE [oss] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [oss] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
EXEC sys.sp_db_vardecimal_storage_format N'oss', N'ON'
GO
USE [oss]
GO
/****** Object:  Table [dbo].[TAu_Authorization]    Script Date: 2015-01-04 15:18:59 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[TAu_Authorization](
	[ID] [numeric](8, 0) IDENTITY(1,1) NOT NULL,
	[MenuID] [varchar](3) NULL,
	[RoleID] [varchar](3) NULL,
	[IsEnabled] [bit] NULL,
 CONSTRAINT [PK_TAU_AUTHORIZATION] PRIMARY KEY NONCLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[TAu_MenuInfo]    Script Date: 2015-01-04 15:18:59 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[TAu_MenuInfo](
	[ID] [smallint] IDENTITY(1,1) NOT NULL,
	[MenuID] [varchar](3) NOT NULL,
	[MenuName] [varchar](50) NOT NULL,
	[URL] [varchar](100) NULL,
	[SortID] [varchar](50) NULL,
	[State] [bit] NULL,
	[tag] [varchar](50) NULL,
	[checked] [bit] NULL,
 CONSTRAINT [PK_TAU_MENUINFO] PRIMARY KEY NONCLUSTERED 
(
	[MenuID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY],
 CONSTRAINT [AK_KEY_2_TAU_MENU] UNIQUE NONCLUSTERED 
(
	[MenuName] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[TAu_MenuInfoDetail]    Script Date: 2015-01-04 15:18:59 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[TAu_MenuInfoDetail](
	[detail_id] [int] IDENTITY(1,1) NOT NULL,
	[MenuID] [varchar](3) NULL,
	[name] [varchar](50) NOT NULL,
	[model] [varchar](100) NULL,
	[src] [varchar](100) NULL,
	[tag] [varchar](100) NULL,
 CONSTRAINT [PK_TAU_MENUINFODETAIL] PRIMARY KEY NONCLUSTERED 
(
	[detail_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[TAu_OperInfo]    Script Date: 2015-01-04 15:18:59 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[TAu_OperInfo](
	[ID] [smallint] IDENTITY(1,1) NOT NULL,
	[OperID] [varchar](6) NOT NULL,
	[RoleID] [varchar](3) NULL,
	[OperName] [varchar](20) NOT NULL,
	[Pwd] [varchar](20) NOT NULL,
	[Address] [varchar](150) NULL,
	[LinkTel] [varchar](50) NOT NULL,
	[QQ] [varchar](50) NULL,
	[Email] [varchar](50) NULL,
	[Mobile] [varchar](20) NOT NULL,
	[SortID] [smallint] NULL,
	[State] [bit] NULL,
 CONSTRAINT [PK_TAU_OPERINFO] PRIMARY KEY NONCLUSTERED 
(
	[OperID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY],
 CONSTRAINT [AK_KEY_2_TAU_OPER] UNIQUE NONCLUSTERED 
(
	[OperName] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[TAu_RoleInfo]    Script Date: 2015-01-04 15:18:59 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[TAu_RoleInfo](
	[ID] [numeric](8, 0) IDENTITY(1,1) NOT NULL,
	[RoleID] [varchar](3) NOT NULL,
	[RoleName] [varchar](20) NOT NULL,
	[SortID] [smallint] NULL,
	[State] [bit] NULL,
	[checked] [bit] NULL,
 CONSTRAINT [PK_TAU_ROLEINFO] PRIMARY KEY NONCLUSTERED 
(
	[RoleID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY],
 CONSTRAINT [AK_KEY_2_TAU_ROLE] UNIQUE NONCLUSTERED 
(
	[RoleName] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[TBa_DeliveryInfo]    Script Date: 2015-01-04 15:18:59 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[TBa_DeliveryInfo](
	[ID] [tinyint] IDENTITY(1,1) NOT NULL,
	[DeliveryID] [varchar](3) NOT NULL,
	[DeliveryName] [varchar](20) NOT NULL,
	[Address] [varchar](150) NOT NULL,
	[LinkName] [varchar](20) NULL,
	[LinkTel] [varchar](20) NULL,
	[QQ] [varchar](50) NULL,
	[Email] [varchar](50) NULL,
	[SortID] [tinyint] NULL,
	[State] [bit] NULL,
 CONSTRAINT [PK_TBA_DELIVERYINFO] PRIMARY KEY NONCLUSTERED 
(
	[DeliveryID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY],
 CONSTRAINT [AK_KEY_2_TBA_DELI] UNIQUE NONCLUSTERED 
(
	[DeliveryName] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[TBa_LogInfo]    Script Date: 2015-01-04 15:18:59 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[TBa_LogInfo](
	[ID] [numeric](8, 0) IDENTITY(1,1) NOT NULL,
	[OperID] [varchar](6) NULL,
	[MenuID] [varchar](3) NULL,
	[LogTime] [datetime] NOT NULL,
	[IP] [varchar](20) NOT NULL,
	[Content] [varchar](2000) NOT NULL,
 CONSTRAINT [PK_TBA_LOGINFO] PRIMARY KEY NONCLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[TBa_MembeAddrInfo]    Script Date: 2015-01-04 15:18:59 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[TBa_MembeAddrInfo](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[UserName] [varchar](20) NULL,
	[RecMan] [varchar](20) NOT NULL,
	[Tel] [varchar](20) NOT NULL,
	[RecAddress] [varchar](150) NOT NULL,
	[PostCode] [varchar](6) NOT NULL,
	[IsDefault] [bit] NULL,
 CONSTRAINT [PK_TBA_MEMBEADDRINFO] PRIMARY KEY NONCLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[TBa_MemberInfo]    Script Date: 2015-01-04 15:18:59 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[TBa_MemberInfo](
	[ID] [numeric](8, 0) IDENTITY(1,1) NOT NULL,
	[UserName] [varchar](20) NOT NULL,
	[Pwd] [varchar](20) NOT NULL,
	[Email] [varchar](50) NOT NULL,
	[lName] [varchar](20) NOT NULL,
	[Balance] [real] NOT NULL,
	[Status] [bit] NULL,
	[RegDate] [datetime] NULL,
	[ActiveDate] [datetime] NULL,
	[Remark] [varchar](100) NULL,
 CONSTRAINT [PK_TBA_MEMBERINFO] PRIMARY KEY NONCLUSTERED 
(
	[UserName] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[TBa_SupplierInfo]    Script Date: 2015-01-04 15:18:59 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[TBa_SupplierInfo](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[SupplierID] [varchar](200) NOT NULL,
	[SupplierName] [varchar](50) NOT NULL,
	[SupplierAB] [varchar](25) NULL,
	[Address] [varchar](200) NOT NULL,
	[LinkName] [varchar](20) NULL,
	[LinkTel] [varchar](50) NULL,
	[QQ] [varchar](50) NULL,
	[Email] [varchar](50) NULL,
	[SortID] [int] NULL,
	[State] [bit] NULL,
 CONSTRAINT [PK_TBA_SUPPLIERINFO] PRIMARY KEY NONCLUSTERED 
(
	[SupplierID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY],
 CONSTRAINT [AK_KEY_2_TBA_SUPP] UNIQUE NONCLUSTERED 
(
	[SupplierName] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[TBa_SupplyRecordInfo]    Script Date: 2015-01-04 15:18:59 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[TBa_SupplyRecordInfo](
	[ID] [numeric](8, 0) NOT NULL,
	[UserName] [varchar](20) NULL,
	[PayAccountNo] [varchar](19) NOT NULL,
	[PayBank] [varchar](50) NOT NULL,
	[RecAccountNo] [varchar](19) NOT NULL,
	[RecBank] [varchar](50) NOT NULL,
	[Remark] [varchar](50) NULL,
	[TotalMoney] [real] NOT NULL,
	[SupplyTime] [datetime] NULL,
 CONSTRAINT [PK_TBA_SUPPLYRECORDINFO] PRIMARY KEY NONCLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[TMe_InStockDetailsInfo]    Script Date: 2015-01-04 15:18:59 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[TMe_InStockDetailsInfo](
	[ID] [numeric](8, 0) IDENTITY(1,1) NOT NULL,
	[MerchandiseID] [varchar](50) NULL,
	[BillCode] [varchar](50) NULL,
	[Num] [int] NOT NULL,
	[Price] [real] NOT NULL,
 CONSTRAINT [PK_TME_INSTOCKDETAILSINFO] PRIMARY KEY NONCLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[TMe_InStockInfo]    Script Date: 2015-01-04 15:18:59 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[TMe_InStockInfo](
	[ID] [numeric](8, 0) IDENTITY(1,1) NOT NULL,
	[BillCode] [varchar](50) NOT NULL,
	[OperID] [varchar](6) NULL,
	[SupplierID] [varchar](200) NULL,
	[InType] [tinyint] NULL,
	[InTime] [datetime] NOT NULL,
	[Handler] [varchar](20) NOT NULL,
	[TotalMoney] [real] NULL,
	[Remark] [varchar](150) NULL,
 CONSTRAINT [PK_TME_INSTOCKINFO] PRIMARY KEY NONCLUSTERED 
(
	[BillCode] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[TMe_MerchandiseCInfo]    Script Date: 2015-01-04 15:18:59 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[TMe_MerchandiseCInfo](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[MerchandiseCID] [varchar](10) NOT NULL,
	[MerchandiseCName] [varchar](50) NOT NULL,
	[SortID] [int] NULL,
	[State] [bit] NULL,
 CONSTRAINT [PK_TME_MERCHANDISECINFO] PRIMARY KEY NONCLUSTERED 
(
	[MerchandiseCID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY],
 CONSTRAINT [AK_KEY_2_TME_MERC] UNIQUE NONCLUSTERED 
(
	[MerchandiseCName] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[TMe_MerchandiseInfo]    Script Date: 2015-01-04 15:18:59 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[TMe_MerchandiseInfo](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[MerchandiseID] [varchar](50) NOT NULL,
	[UnitID] [int] NULL,
	[ProStatusID] [int] NULL,
	[MerchandiseCID] [varchar](10) NULL,
	[MerchandiseName] [varchar](50) NOT NULL,
	[MerchandiseAB] [varchar](25) NULL,
	[Price] [real] NOT NULL,
	[SaleStatus] [bit] NOT NULL,
	[Spec] [varchar](200) NULL,
	[Describe] [varchar](200) NULL,
	[PicPath] [varchar](100) NULL,
	[ClickCount] [int] NULL,
	[Remark] [varchar](100) NULL,
 CONSTRAINT [PK_TME_MERCHANDISEINFO] PRIMARY KEY NONCLUSTERED 
(
	[MerchandiseID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[TMe_OrderDetailsInfo]    Script Date: 2015-01-04 15:18:59 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[TMe_OrderDetailsInfo](
	[ID] [numeric](8, 0) IDENTITY(1,1) NOT NULL,
	[BillCode] [varchar](30) NULL,
	[MerchandiseID] [varchar](50) NULL,
	[UnitID] [int] NULL,
	[Num] [int] NULL,
	[Price] [real] NULL,
 CONSTRAINT [PK_TME_ORDERDETAILSINFO] PRIMARY KEY NONCLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[TMe_OrderInfo]    Script Date: 2015-01-04 15:18:59 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[TMe_OrderInfo](
	[BillCode] [varchar](30) NOT NULL,
	[UserName] [varchar](20) NULL,
	[DeliveryID] [varchar](3) NULL,
	[OperID] [varchar](6) NULL,
	[OutBillCode] [varchar](50) NULL,
	[PostBillCode] [varchar](20) NULL,
	[BillStatus] [tinyint] NOT NULL,
	[OrderTime] [datetime] NULL,
	[RecMan] [varchar](20) NOT NULL,
	[LinkTel] [varchar](20) NOT NULL,
	[RecAddress] [varchar](150) NOT NULL,
	[PostCode] [varchar](6) NOT NULL,
	[TotalMoney] [real] NULL,
	[Remark] [varchar](50) NULL,
 CONSTRAINT [PK_TME_ORDERINFO] PRIMARY KEY NONCLUSTERED 
(
	[BillCode] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[TMe_OutStockDetailsInfo]    Script Date: 2015-01-04 15:18:59 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[TMe_OutStockDetailsInfo](
	[ID] [numeric](8, 0) IDENTITY(1,1) NOT NULL,
	[MerchandiseID] [varchar](50) NULL,
	[OutBillCode] [varchar](50) NULL,
	[Num] [int] NULL,
	[Price] [real] NULL,
	[stock_price] [real] NULL,
 CONSTRAINT [PK_TME_OUTSTOCKDETAILSINFO] PRIMARY KEY NONCLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[TMe_OutStockInfo]    Script Date: 2015-01-04 15:18:59 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[TMe_OutStockInfo](
	[ID] [numeric](8, 0) IDENTITY(1,1) NOT NULL,
	[OutBillCode] [varchar](50) NOT NULL,
	[OperID] [varchar](6) NULL,
	[OutTime] [datetime] NOT NULL,
	[Handler] [varchar](20) NOT NULL,
	[OutType] [tinyint] NULL,
	[TotalMoney] [real] NULL,
	[Remark] [varchar](150) NULL,
 CONSTRAINT [PK_TME_OUTSTOCKINFO] PRIMARY KEY NONCLUSTERED 
(
	[OutBillCode] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[TMe_ProStatusInfo]    Script Date: 2015-01-04 15:18:59 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[TMe_ProStatusInfo](
	[ProStatusID] [int] IDENTITY(1,1) NOT NULL,
	[ProStatusName] [varchar](20) NOT NULL,
	[Status] [bit] NULL,
	[Remark] [varchar](50) NULL,
 CONSTRAINT [PK_TME_PROSTATUSINFO] PRIMARY KEY NONCLUSTERED 
(
	[ProStatusID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY],
 CONSTRAINT [AK_KEY_1_TME_PROS] UNIQUE NONCLUSTERED 
(
	[ProStatusName] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[TMe_StockInfo]    Script Date: 2015-01-04 15:18:59 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[TMe_StockInfo](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[MerchandiseID] [varchar](50) NULL,
	[AvgPrice] [real] NOT NULL,
	[Num] [int] NOT NULL,
 CONSTRAINT [PK_TME_STOCKINFO] PRIMARY KEY NONCLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[TMe_Trolley]    Script Date: 2015-01-04 15:18:59 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[TMe_Trolley](
	[TrolleyID] [int] IDENTITY(1,1) NOT NULL,
	[UserName] [varchar](20) NULL,
	[CreateDate] [datetime] NULL,
	[TrolleyState] [bit] NULL,
 CONSTRAINT [PK_TMe_Trolley] PRIMARY KEY CLUSTERED 
(
	[TrolleyID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[TMe_TrolleyItem]    Script Date: 2015-01-04 15:18:59 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[TMe_TrolleyItem](
	[TrolleyItemID] [int] IDENTITY(1,1) NOT NULL,
	[TrolleyID] [int] NOT NULL,
	[MerchandiseName] [varchar](50) NOT NULL,
	[PicPath] [varchar](100) NULL,
	[UnitPrice] [real] NULL,
	[Num] [int] NULL,
	[SubTotal] [real] NULL,
	[IsBuy] [bit] NULL,
 CONSTRAINT [PK_TrolleyItem] PRIMARY KEY CLUSTERED 
(
	[TrolleyItemID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[TMe_UnitInfo]    Script Date: 2015-01-04 15:18:59 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[TMe_UnitInfo](
	[UnitID] [int] IDENTITY(1,1) NOT NULL,
	[Name] [varchar](20) NOT NULL,
	[Status] [bit] NULL,
	[Remark] [varchar](50) NULL,
 CONSTRAINT [PK_TME_UNITINFO] PRIMARY KEY NONCLUSTERED 
(
	[UnitID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY],
 CONSTRAINT [AK_KEY_1_TME_UNIT] UNIQUE NONCLUSTERED 
(
	[Name] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  View [dbo].[V_CheckTreeInfo]    Script Date: 2015-01-04 15:18:59 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE VIEW [dbo].[V_CheckTreeInfo]
AS
SELECT MenuID, MenuName AS text, URL, SortID, State AS leaf, tag, checked, ID
FROM dbo.TAu_MenuInfo

GO
/****** Object:  View [dbo].[V_InStockChart]    Script Date: 2015-01-04 15:18:59 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE VIEW [dbo].[V_InStockChart]
AS
SELECT dbo.TMe_InStockDetailsInfo.Num, dbo.TMe_InStockDetailsInfo.Price, 
      dbo.TMe_InStockDetailsInfo.ID, dbo.TMe_InStockInfo.InTime, 
      dbo.TMe_InStockInfo.TotalMoney, 
      dbo.TMe_MerchandiseInfo.MerchandiseName
FROM dbo.TMe_InStockDetailsInfo INNER JOIN
      dbo.TMe_InStockInfo ON 
      dbo.TMe_InStockDetailsInfo.BillCode = dbo.TMe_InStockInfo.BillCode INNER JOIN
      dbo.TMe_MerchandiseInfo ON 
      dbo.TMe_InStockDetailsInfo.MerchandiseID = dbo.TMe_MerchandiseInfo.MerchandiseID

GO
/****** Object:  View [dbo].[V_MenuInfo1]    Script Date: 2015-01-04 15:18:59 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE VIEW [dbo].[V_MenuInfo1]
AS
SELECT dbo.TAu_MenuInfo.tag, dbo.TAu_MenuInfo.State AS leaf, dbo.TAu_MenuInfo.SortID, 
      dbo.TAu_MenuInfo.URL, dbo.TAu_MenuInfo.MenuName AS text, dbo.TAu_MenuInfo.ID, 
      dbo.TAu_Authorization.RoleID, dbo.TAu_Authorization.MenuID
FROM dbo.TAu_MenuInfo INNER JOIN
      dbo.TAu_Authorization ON 
      dbo.TAu_MenuInfo.MenuID = dbo.TAu_Authorization.MenuID

GO
/****** Object:  View [dbo].[V_OutStockChart]    Script Date: 2015-01-04 15:18:59 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE VIEW [dbo].[V_OutStockChart]
AS
SELECT dbo.TMe_MerchandiseInfo.MerchandiseName, dbo.TMe_OutStockDetailsInfo.Num, 
      dbo.TMe_OutStockDetailsInfo.Price, dbo.TMe_OutStockDetailsInfo.stock_price, 
      dbo.TMe_OutStockInfo.OutTime, dbo.TMe_OutStockInfo.ID
FROM dbo.TMe_OutStockDetailsInfo INNER JOIN
      dbo.TMe_OutStockInfo ON 
      dbo.TMe_OutStockDetailsInfo.OutBillCode = dbo.TMe_OutStockInfo.OutBillCode INNER
       JOIN
      dbo.TMe_MerchandiseInfo ON 
      dbo.TMe_OutStockDetailsInfo.MerchandiseID = dbo.TMe_MerchandiseInfo.MerchandiseID
GROUP BY dbo.TMe_MerchandiseInfo.MerchandiseName, 
      dbo.TMe_OutStockDetailsInfo.Num, dbo.TMe_OutStockDetailsInfo.Price, 
      dbo.TMe_OutStockDetailsInfo.stock_price, dbo.TMe_OutStockInfo.OutTime, 
      dbo.TMe_OutStockInfo.ID

GO
/****** Object:  View [dbo].[V_RoleInfo]    Script Date: 2015-01-04 15:18:59 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE VIEW [dbo].[V_RoleInfo]
AS
SELECT checked, RoleID, RoleName AS text, State AS leaf
FROM dbo.TAu_RoleInfo

GO
/****** Object:  View [dbo].[V_StockInfoChart]    Script Date: 2015-01-04 15:18:59 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE VIEW [dbo].[V_StockInfoChart]
AS
SELECT dbo.TMe_MerchandiseInfo.MerchandiseName, dbo.TMe_StockInfo.ID, 
      dbo.TMe_StockInfo.Num, dbo.TMe_StockInfo.AvgPrice
FROM dbo.TMe_StockInfo INNER JOIN
      dbo.TMe_MerchandiseInfo ON 
      dbo.TMe_StockInfo.MerchandiseID = dbo.TMe_MerchandiseInfo.MerchandiseID

GO
/****** Object:  Index [Idx_TBa_LogInfo_LogTime]    Script Date: 2015-01-04 15:18:59 ******/
CREATE NONCLUSTERED INDEX [Idx_TBa_LogInfo_LogTime] ON [dbo].[TBa_LogInfo]
(
	[LogTime] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
SET ANSI_PADDING ON

GO
/****** Object:  Index [Idx_TBa_LogInfo_OperID]    Script Date: 2015-01-04 15:18:59 ******/
CREATE NONCLUSTERED INDEX [Idx_TBa_LogInfo_OperID] ON [dbo].[TBa_LogInfo]
(
	[OperID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
SET ANSI_PADDING ON

GO
/****** Object:  Index [Idx_SIdx_upplyRecordInfo_SupplyTime]    Script Date: 2015-01-04 15:18:59 ******/
CREATE NONCLUSTERED INDEX [Idx_SIdx_upplyRecordInfo_SupplyTime] ON [dbo].[TBa_SupplyRecordInfo]
(
	[SupplyTime] ASC,
	[RecAccountNo] ASC,
	[PayAccountNo] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
SET ANSI_PADDING ON

GO
/****** Object:  Index [Idx_InStockDetailsInfo_BillCode]    Script Date: 2015-01-04 15:18:59 ******/
CREATE NONCLUSTERED INDEX [Idx_InStockDetailsInfo_BillCode] ON [dbo].[TMe_InStockDetailsInfo]
(
	[BillCode] ASC,
	[MerchandiseID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
SET ANSI_PADDING ON

GO
/****** Object:  Index [Idx_InStockInfo_Handler]    Script Date: 2015-01-04 15:18:59 ******/
CREATE NONCLUSTERED INDEX [Idx_InStockInfo_Handler] ON [dbo].[TMe_InStockInfo]
(
	[Handler] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
/****** Object:  Index [Idx_InStockInfo_InTime]    Script Date: 2015-01-04 15:18:59 ******/
CREATE NONCLUSTERED INDEX [Idx_InStockInfo_InTime] ON [dbo].[TMe_InStockInfo]
(
	[InTime] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
SET ANSI_PADDING ON

GO
/****** Object:  Index [Idx_InStockInfo_OperID]    Script Date: 2015-01-04 15:18:59 ******/
CREATE NONCLUSTERED INDEX [Idx_InStockInfo_OperID] ON [dbo].[TMe_InStockInfo]
(
	[OperID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
SET ANSI_PADDING ON

GO
/****** Object:  Index [Idx_MerchandiseInfo_MerchandiseAB]    Script Date: 2015-01-04 15:18:59 ******/
CREATE NONCLUSTERED INDEX [Idx_MerchandiseInfo_MerchandiseAB] ON [dbo].[TMe_MerchandiseInfo]
(
	[MerchandiseAB] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
SET ANSI_PADDING ON

GO
/****** Object:  Index [Idx_MerchandiseInfo_MerchandiseCID]    Script Date: 2015-01-04 15:18:59 ******/
CREATE NONCLUSTERED INDEX [Idx_MerchandiseInfo_MerchandiseCID] ON [dbo].[TMe_MerchandiseInfo]
(
	[MerchandiseCID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
SET ANSI_PADDING ON

GO
/****** Object:  Index [Idx_MerchandiseInfo_MerchandiseName]    Script Date: 2015-01-04 15:18:59 ******/
CREATE NONCLUSTERED INDEX [Idx_MerchandiseInfo_MerchandiseName] ON [dbo].[TMe_MerchandiseInfo]
(
	[MerchandiseName] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
SET ANSI_PADDING ON

GO
/****** Object:  Index [Idx_OrderDetailsInfo_BillCode]    Script Date: 2015-01-04 15:18:59 ******/
CREATE NONCLUSTERED INDEX [Idx_OrderDetailsInfo_BillCode] ON [dbo].[TMe_OrderDetailsInfo]
(
	[BillCode] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
SET ANSI_PADDING ON

GO
/****** Object:  Index [Idx_OrderDetailsInfo_MerchandiseID]    Script Date: 2015-01-04 15:18:59 ******/
CREATE NONCLUSTERED INDEX [Idx_OrderDetailsInfo_MerchandiseID] ON [dbo].[TMe_OrderDetailsInfo]
(
	[MerchandiseID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
/****** Object:  Index [Idx_OrderInfo_OrderTime]    Script Date: 2015-01-04 15:18:59 ******/
CREATE NONCLUSTERED INDEX [Idx_OrderInfo_OrderTime] ON [dbo].[TMe_OrderInfo]
(
	[OrderTime] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
SET ANSI_PADDING ON

GO
/****** Object:  Index [Idx_OrderInfo_UserName]    Script Date: 2015-01-04 15:18:59 ******/
CREATE NONCLUSTERED INDEX [Idx_OrderInfo_UserName] ON [dbo].[TMe_OrderInfo]
(
	[UserName] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
SET ANSI_PADDING ON

GO
/****** Object:  Index [Idx_OutStockDetailsInfo_MerchandiseID]    Script Date: 2015-01-04 15:18:59 ******/
CREATE NONCLUSTERED INDEX [Idx_OutStockDetailsInfo_MerchandiseID] ON [dbo].[TMe_OutStockDetailsInfo]
(
	[MerchandiseID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
SET ANSI_PADDING ON

GO
/****** Object:  Index [Idx_OutStockDetailsInfo_OutBillCode]    Script Date: 2015-01-04 15:18:59 ******/
CREATE NONCLUSTERED INDEX [Idx_OutStockDetailsInfo_OutBillCode] ON [dbo].[TMe_OutStockDetailsInfo]
(
	[OutBillCode] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
SET ANSI_PADDING ON

GO
/****** Object:  Index [Idx_OutStockInfo_Handler]    Script Date: 2015-01-04 15:18:59 ******/
CREATE NONCLUSTERED INDEX [Idx_OutStockInfo_Handler] ON [dbo].[TMe_OutStockInfo]
(
	[Handler] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
SET ANSI_PADDING ON

GO
/****** Object:  Index [Idx_OutStockInfo_OperID]    Script Date: 2015-01-04 15:18:59 ******/
CREATE NONCLUSTERED INDEX [Idx_OutStockInfo_OperID] ON [dbo].[TMe_OutStockInfo]
(
	[OperID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
/****** Object:  Index [Idx_OutStockInfo_OutTime]    Script Date: 2015-01-04 15:18:59 ******/
CREATE NONCLUSTERED INDEX [Idx_OutStockInfo_OutTime] ON [dbo].[TMe_OutStockInfo]
(
	[OutTime] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
ALTER TABLE [dbo].[TAu_Authorization] ADD  DEFAULT ((0)) FOR [IsEnabled]
GO
ALTER TABLE [dbo].[TAu_MenuInfo] ADD  CONSTRAINT [DF__TAu_MenuI__State__6FB49575]  DEFAULT ((1)) FOR [State]
GO
ALTER TABLE [dbo].[TAu_OperInfo] ADD  DEFAULT ((0)) FOR [State]
GO
ALTER TABLE [dbo].[TAu_RoleInfo] ADD  DEFAULT ((1)) FOR [State]
GO
ALTER TABLE [dbo].[TBa_DeliveryInfo] ADD  DEFAULT ((1)) FOR [State]
GO
ALTER TABLE [dbo].[TBa_MembeAddrInfo] ADD  DEFAULT ((0)) FOR [IsDefault]
GO
ALTER TABLE [dbo].[TBa_MemberInfo] ADD  DEFAULT ((0)) FOR [Balance]
GO
ALTER TABLE [dbo].[TBa_MemberInfo] ADD  DEFAULT ((0)) FOR [Status]
GO
ALTER TABLE [dbo].[TBa_MemberInfo] ADD  DEFAULT (getdate()) FOR [RegDate]
GO
ALTER TABLE [dbo].[TBa_SupplierInfo] ADD  CONSTRAINT [DF__TBa_Suppl__State__11158940]  DEFAULT ((1)) FOR [State]
GO
ALTER TABLE [dbo].[TBa_SupplyRecordInfo] ADD  DEFAULT (getdate()) FOR [SupplyTime]
GO
ALTER TABLE [dbo].[TMe_InStockInfo] ADD  CONSTRAINT [DF__TMe_InSto__InTyp__19AACF41]  DEFAULT ((1)) FOR [InType]
GO
ALTER TABLE [dbo].[TMe_MerchandiseCInfo] ADD  DEFAULT ((1)) FOR [State]
GO
ALTER TABLE [dbo].[TMe_MerchandiseInfo] ADD  CONSTRAINT [DF__TMe_Merch__SaleS__22401542]  DEFAULT ((1)) FOR [SaleStatus]
GO
ALTER TABLE [dbo].[TMe_MerchandiseInfo] ADD  CONSTRAINT [DF__TMe_Merch__Click__24285DB4]  DEFAULT ((0)) FOR [ClickCount]
GO
ALTER TABLE [dbo].[TMe_OrderInfo] ADD  CONSTRAINT [DF__TMe_Order__BillS__28ED12D1]  DEFAULT ((1)) FOR [BillStatus]
GO
ALTER TABLE [dbo].[TMe_OrderInfo] ADD  CONSTRAINT [DF__TMe_Order__Order__2AD55B43]  DEFAULT (getdate()) FOR [OrderTime]
GO
ALTER TABLE [dbo].[TMe_OutStockInfo] ADD  CONSTRAINT [DF__TMe_OutSt__OutTy__2F9A1060]  DEFAULT ((1)) FOR [OutType]
GO
ALTER TABLE [dbo].[TAu_Authorization]  WITH CHECK ADD  CONSTRAINT [FK_TAU_AUTH_REFERENCE_TAU_MENU] FOREIGN KEY([MenuID])
REFERENCES [dbo].[TAu_MenuInfo] ([MenuID])
GO
ALTER TABLE [dbo].[TAu_Authorization] CHECK CONSTRAINT [FK_TAU_AUTH_REFERENCE_TAU_MENU]
GO
ALTER TABLE [dbo].[TAu_Authorization]  WITH CHECK ADD  CONSTRAINT [FK_TAU_AUTH_REFERENCE_TAU_ROLE] FOREIGN KEY([RoleID])
REFERENCES [dbo].[TAu_RoleInfo] ([RoleID])
GO
ALTER TABLE [dbo].[TAu_Authorization] CHECK CONSTRAINT [FK_TAU_AUTH_REFERENCE_TAU_ROLE]
GO
ALTER TABLE [dbo].[TAu_MenuInfoDetail]  WITH CHECK ADD  CONSTRAINT [FK_TAU_MENU_REFERENCE_TAU_MENU] FOREIGN KEY([MenuID])
REFERENCES [dbo].[TAu_MenuInfo] ([MenuID])
GO
ALTER TABLE [dbo].[TAu_MenuInfoDetail] CHECK CONSTRAINT [FK_TAU_MENU_REFERENCE_TAU_MENU]
GO
ALTER TABLE [dbo].[TAu_OperInfo]  WITH CHECK ADD  CONSTRAINT [FK_TAU_OPER_REFERENCE_TAU_ROLE] FOREIGN KEY([RoleID])
REFERENCES [dbo].[TAu_RoleInfo] ([RoleID])
GO
ALTER TABLE [dbo].[TAu_OperInfo] CHECK CONSTRAINT [FK_TAU_OPER_REFERENCE_TAU_ROLE]
GO
ALTER TABLE [dbo].[TBa_LogInfo]  WITH CHECK ADD  CONSTRAINT [FK_TBA_LOGI_REFERENCE_TAU_MENU] FOREIGN KEY([MenuID])
REFERENCES [dbo].[TAu_MenuInfo] ([MenuID])
GO
ALTER TABLE [dbo].[TBa_LogInfo] CHECK CONSTRAINT [FK_TBA_LOGI_REFERENCE_TAU_MENU]
GO
ALTER TABLE [dbo].[TBa_LogInfo]  WITH CHECK ADD  CONSTRAINT [FK_TBA_LOGI_REFERENCE_TAU_OPER] FOREIGN KEY([OperID])
REFERENCES [dbo].[TAu_OperInfo] ([OperID])
GO
ALTER TABLE [dbo].[TBa_LogInfo] CHECK CONSTRAINT [FK_TBA_LOGI_REFERENCE_TAU_OPER]
GO
ALTER TABLE [dbo].[TBa_MembeAddrInfo]  WITH CHECK ADD  CONSTRAINT [FK_TBA_MEMB_REFERENCE_TBA_MEMB] FOREIGN KEY([UserName])
REFERENCES [dbo].[TBa_MemberInfo] ([UserName])
GO
ALTER TABLE [dbo].[TBa_MembeAddrInfo] CHECK CONSTRAINT [FK_TBA_MEMB_REFERENCE_TBA_MEMB]
GO
ALTER TABLE [dbo].[TBa_SupplyRecordInfo]  WITH CHECK ADD  CONSTRAINT [FK_TBA_SUPP_REFERENCE_TBA_MEMB] FOREIGN KEY([UserName])
REFERENCES [dbo].[TBa_MemberInfo] ([UserName])
GO
ALTER TABLE [dbo].[TBa_SupplyRecordInfo] CHECK CONSTRAINT [FK_TBA_SUPP_REFERENCE_TBA_MEMB]
GO
ALTER TABLE [dbo].[TMe_InStockDetailsInfo]  WITH CHECK ADD  CONSTRAINT [FK_TME_INST_REFERENCE_TME_INST] FOREIGN KEY([BillCode])
REFERENCES [dbo].[TMe_InStockInfo] ([BillCode])
GO
ALTER TABLE [dbo].[TMe_InStockDetailsInfo] CHECK CONSTRAINT [FK_TME_INST_REFERENCE_TME_INST]
GO
ALTER TABLE [dbo].[TMe_InStockDetailsInfo]  WITH CHECK ADD  CONSTRAINT [FK_TME_INST_REFERENCE_TME_MERC] FOREIGN KEY([MerchandiseID])
REFERENCES [dbo].[TMe_MerchandiseInfo] ([MerchandiseID])
GO
ALTER TABLE [dbo].[TMe_InStockDetailsInfo] CHECK CONSTRAINT [FK_TME_INST_REFERENCE_TME_MERC]
GO
ALTER TABLE [dbo].[TMe_InStockInfo]  WITH CHECK ADD  CONSTRAINT [FK_TME_INST_REFERENCE_TAU_OPER] FOREIGN KEY([OperID])
REFERENCES [dbo].[TAu_OperInfo] ([OperID])
GO
ALTER TABLE [dbo].[TMe_InStockInfo] CHECK CONSTRAINT [FK_TME_INST_REFERENCE_TAU_OPER]
GO
ALTER TABLE [dbo].[TMe_InStockInfo]  WITH CHECK ADD  CONSTRAINT [FK_TME_INST_REFERENCE_TBA_SUPP] FOREIGN KEY([SupplierID])
REFERENCES [dbo].[TBa_SupplierInfo] ([SupplierID])
GO
ALTER TABLE [dbo].[TMe_InStockInfo] CHECK CONSTRAINT [FK_TME_INST_REFERENCE_TBA_SUPP]
GO
ALTER TABLE [dbo].[TMe_MerchandiseInfo]  WITH CHECK ADD  CONSTRAINT [FK_TME_MERC_REFERENCE_TME_MERC] FOREIGN KEY([MerchandiseCID])
REFERENCES [dbo].[TMe_MerchandiseCInfo] ([MerchandiseCID])
GO
ALTER TABLE [dbo].[TMe_MerchandiseInfo] CHECK CONSTRAINT [FK_TME_MERC_REFERENCE_TME_MERC]
GO
ALTER TABLE [dbo].[TMe_MerchandiseInfo]  WITH CHECK ADD  CONSTRAINT [FK_TME_MERC_REFERENCE_TME_PROS] FOREIGN KEY([ProStatusID])
REFERENCES [dbo].[TMe_ProStatusInfo] ([ProStatusID])
GO
ALTER TABLE [dbo].[TMe_MerchandiseInfo] CHECK CONSTRAINT [FK_TME_MERC_REFERENCE_TME_PROS]
GO
ALTER TABLE [dbo].[TMe_MerchandiseInfo]  WITH CHECK ADD  CONSTRAINT [FK_TME_MERC_REFERENCE_TME_UNIT] FOREIGN KEY([UnitID])
REFERENCES [dbo].[TMe_UnitInfo] ([UnitID])
GO
ALTER TABLE [dbo].[TMe_MerchandiseInfo] CHECK CONSTRAINT [FK_TME_MERC_REFERENCE_TME_UNIT]
GO
ALTER TABLE [dbo].[TMe_OrderDetailsInfo]  WITH CHECK ADD  CONSTRAINT [FK_TME_ORDE_REFERENCE_TME_MERC] FOREIGN KEY([MerchandiseID])
REFERENCES [dbo].[TMe_MerchandiseInfo] ([MerchandiseID])
GO
ALTER TABLE [dbo].[TMe_OrderDetailsInfo] CHECK CONSTRAINT [FK_TME_ORDE_REFERENCE_TME_MERC]
GO
ALTER TABLE [dbo].[TMe_OrderDetailsInfo]  WITH CHECK ADD  CONSTRAINT [FK_TME_ORDE_REFERENCE_TME_ORDE] FOREIGN KEY([BillCode])
REFERENCES [dbo].[TMe_OrderInfo] ([BillCode])
GO
ALTER TABLE [dbo].[TMe_OrderDetailsInfo] CHECK CONSTRAINT [FK_TME_ORDE_REFERENCE_TME_ORDE]
GO
ALTER TABLE [dbo].[TMe_OrderDetailsInfo]  WITH CHECK ADD  CONSTRAINT [FK_TME_ORDE_REFERENCE_TME_UNIT] FOREIGN KEY([UnitID])
REFERENCES [dbo].[TMe_UnitInfo] ([UnitID])
GO
ALTER TABLE [dbo].[TMe_OrderDetailsInfo] CHECK CONSTRAINT [FK_TME_ORDE_REFERENCE_TME_UNIT]
GO
ALTER TABLE [dbo].[TMe_OrderInfo]  WITH CHECK ADD  CONSTRAINT [FK_TME_ORDE_REFERENCE_TAU_OPER] FOREIGN KEY([OperID])
REFERENCES [dbo].[TAu_OperInfo] ([OperID])
GO
ALTER TABLE [dbo].[TMe_OrderInfo] CHECK CONSTRAINT [FK_TME_ORDE_REFERENCE_TAU_OPER]
GO
ALTER TABLE [dbo].[TMe_OrderInfo]  WITH CHECK ADD  CONSTRAINT [FK_TME_ORDE_REFERENCE_TBA_DELI] FOREIGN KEY([DeliveryID])
REFERENCES [dbo].[TBa_DeliveryInfo] ([DeliveryID])
GO
ALTER TABLE [dbo].[TMe_OrderInfo] CHECK CONSTRAINT [FK_TME_ORDE_REFERENCE_TBA_DELI]
GO
ALTER TABLE [dbo].[TMe_OrderInfo]  WITH CHECK ADD  CONSTRAINT [FK_TME_ORDE_REFERENCE_TBA_MEMB] FOREIGN KEY([UserName])
REFERENCES [dbo].[TBa_MemberInfo] ([UserName])
GO
ALTER TABLE [dbo].[TMe_OrderInfo] CHECK CONSTRAINT [FK_TME_ORDE_REFERENCE_TBA_MEMB]
GO
ALTER TABLE [dbo].[TMe_OrderInfo]  WITH CHECK ADD  CONSTRAINT [FK_TME_ORDE_REFERENCE_TME_OUTS] FOREIGN KEY([OutBillCode])
REFERENCES [dbo].[TMe_OutStockInfo] ([OutBillCode])
GO
ALTER TABLE [dbo].[TMe_OrderInfo] CHECK CONSTRAINT [FK_TME_ORDE_REFERENCE_TME_OUTS]
GO
ALTER TABLE [dbo].[TMe_OutStockDetailsInfo]  WITH CHECK ADD  CONSTRAINT [FK_TME_OUTS_REFERENCE_TME_MERC] FOREIGN KEY([MerchandiseID])
REFERENCES [dbo].[TMe_MerchandiseInfo] ([MerchandiseID])
GO
ALTER TABLE [dbo].[TMe_OutStockDetailsInfo] CHECK CONSTRAINT [FK_TME_OUTS_REFERENCE_TME_MERC]
GO
ALTER TABLE [dbo].[TMe_OutStockDetailsInfo]  WITH CHECK ADD  CONSTRAINT [FK_TME_OUTS_REFERENCE_TME_OUTS] FOREIGN KEY([OutBillCode])
REFERENCES [dbo].[TMe_OutStockInfo] ([OutBillCode])
GO
ALTER TABLE [dbo].[TMe_OutStockDetailsInfo] CHECK CONSTRAINT [FK_TME_OUTS_REFERENCE_TME_OUTS]
GO
ALTER TABLE [dbo].[TMe_OutStockInfo]  WITH CHECK ADD  CONSTRAINT [FK_TME_OUTS_REFERENCE_TAU_OPER] FOREIGN KEY([OperID])
REFERENCES [dbo].[TAu_OperInfo] ([OperID])
GO
ALTER TABLE [dbo].[TMe_OutStockInfo] CHECK CONSTRAINT [FK_TME_OUTS_REFERENCE_TAU_OPER]
GO
ALTER TABLE [dbo].[TMe_StockInfo]  WITH CHECK ADD  CONSTRAINT [FK_TME_STOC_REFERENCE_TME_MERC] FOREIGN KEY([MerchandiseID])
REFERENCES [dbo].[TMe_MerchandiseInfo] ([MerchandiseID])
GO
ALTER TABLE [dbo].[TMe_StockInfo] CHECK CONSTRAINT [FK_TME_STOC_REFERENCE_TME_MERC]
GO
ALTER TABLE [dbo].[TMe_Trolley]  WITH CHECK ADD  CONSTRAINT [FK_TMe_Trolley_TBa_MemberInfo] FOREIGN KEY([UserName])
REFERENCES [dbo].[TBa_MemberInfo] ([UserName])
GO
ALTER TABLE [dbo].[TMe_Trolley] CHECK CONSTRAINT [FK_TMe_Trolley_TBa_MemberInfo]
GO
ALTER TABLE [dbo].[TAu_MenuInfo]  WITH CHECK ADD  CONSTRAINT [CKC_STATE_TAU_MENU] CHECK  (([State] IS NULL OR ([State]=(1) OR [State]=(0))))
GO
ALTER TABLE [dbo].[TAu_MenuInfo] CHECK CONSTRAINT [CKC_STATE_TAU_MENU]
GO
ALTER TABLE [dbo].[TAu_OperInfo]  WITH CHECK ADD  CONSTRAINT [CKC_STATE_TAU_OPER] CHECK  (([State] IS NULL OR ([State]=(1) OR [State]=(0))))
GO
ALTER TABLE [dbo].[TAu_OperInfo] CHECK CONSTRAINT [CKC_STATE_TAU_OPER]
GO
ALTER TABLE [dbo].[TAu_RoleInfo]  WITH CHECK ADD  CONSTRAINT [CKC_STATE_TAU_ROLE] CHECK  (([State] IS NULL OR ([State]=(1) OR [State]=(0))))
GO
ALTER TABLE [dbo].[TAu_RoleInfo] CHECK CONSTRAINT [CKC_STATE_TAU_ROLE]
GO
ALTER TABLE [dbo].[TBa_DeliveryInfo]  WITH CHECK ADD  CONSTRAINT [CKC_STATE_TBA_DELI] CHECK  (([State] IS NULL OR ([State]=(1) OR [State]=(0))))
GO
ALTER TABLE [dbo].[TBa_DeliveryInfo] CHECK CONSTRAINT [CKC_STATE_TBA_DELI]
GO
ALTER TABLE [dbo].[TBa_MembeAddrInfo]  WITH CHECK ADD  CONSTRAINT [CKC_ISDEFAULT_TBA_MEMB] CHECK  (([IsDefault] IS NULL OR ([IsDefault]=(1) OR [IsDefault]=(0))))
GO
ALTER TABLE [dbo].[TBa_MembeAddrInfo] CHECK CONSTRAINT [CKC_ISDEFAULT_TBA_MEMB]
GO
ALTER TABLE [dbo].[TBa_MemberInfo]  WITH CHECK ADD  CONSTRAINT [CKC_STATUS_TBA_MEMB] CHECK  (([Status] IS NULL OR ([Status]=(1) OR [Status]=(0))))
GO
ALTER TABLE [dbo].[TBa_MemberInfo] CHECK CONSTRAINT [CKC_STATUS_TBA_MEMB]
GO
ALTER TABLE [dbo].[TBa_MemberInfo]  WITH CHECK ADD  CONSTRAINT [CKT_TBA_MEMBERINFO] CHECK  (([Balance]>=(0)))
GO
ALTER TABLE [dbo].[TBa_MemberInfo] CHECK CONSTRAINT [CKT_TBA_MEMBERINFO]
GO
ALTER TABLE [dbo].[TBa_SupplierInfo]  WITH CHECK ADD  CONSTRAINT [CKC_STATE_TBA_SUPP] CHECK  (([State] IS NULL OR ([State]=(1) OR [State]=(0))))
GO
ALTER TABLE [dbo].[TBa_SupplierInfo] CHECK CONSTRAINT [CKC_STATE_TBA_SUPP]
GO
ALTER TABLE [dbo].[TMe_InStockInfo]  WITH CHECK ADD  CONSTRAINT [CKC_INTYPE_TME_INST] CHECK  (([InType] IS NULL OR ([InType]=(3) OR [InType]=(2) OR [InType]=(1))))
GO
ALTER TABLE [dbo].[TMe_InStockInfo] CHECK CONSTRAINT [CKC_INTYPE_TME_INST]
GO
ALTER TABLE [dbo].[TMe_MerchandiseCInfo]  WITH CHECK ADD  CONSTRAINT [CKC_STATE_TME_MERC] CHECK  (([State] IS NULL OR ([State]=(1) OR [State]=(0))))
GO
ALTER TABLE [dbo].[TMe_MerchandiseCInfo] CHECK CONSTRAINT [CKC_STATE_TME_MERC]
GO
ALTER TABLE [dbo].[TMe_MerchandiseInfo]  WITH CHECK ADD  CONSTRAINT [CKC_SALESTATUS_TME_MERC] CHECK  (([SaleStatus]=(0) OR [SaleStatus]=(1)))
GO
ALTER TABLE [dbo].[TMe_MerchandiseInfo] CHECK CONSTRAINT [CKC_SALESTATUS_TME_MERC]
GO
ALTER TABLE [dbo].[TMe_OrderInfo]  WITH CHECK ADD  CONSTRAINT [CKC_BILLSTATUS_TME_ORDE] CHECK  (([BillStatus]=(4) OR [BillStatus]=(3) OR [BillStatus]=(2) OR [BillStatus]=(1)))
GO
ALTER TABLE [dbo].[TMe_OrderInfo] CHECK CONSTRAINT [CKC_BILLSTATUS_TME_ORDE]
GO
ALTER TABLE [dbo].[TMe_OutStockInfo]  WITH CHECK ADD  CONSTRAINT [CKC_OUTTYPE_TME_OUTS] CHECK  (([OutType] IS NULL OR ([OutType]=(3) OR [OutType]=(2) OR [OutType]=(1))))
GO
ALTER TABLE [dbo].[TMe_OutStockInfo] CHECK CONSTRAINT [CKC_OUTTYPE_TME_OUTS]
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'递增的流水号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TAu_Authorization', @level2type=N'COLUMN',@level2name=N'ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'菜单编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TAu_Authorization', @level2type=N'COLUMN',@level2name=N'MenuID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'角色编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TAu_Authorization', @level2type=N'COLUMN',@level2name=N'RoleID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'是否有权限' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TAu_Authorization', @level2type=N'COLUMN',@level2name=N'IsEnabled'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'权限信息表' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TAu_Authorization'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'递增的流水号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TAu_MenuInfo', @level2type=N'COLUMN',@level2name=N'ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'菜单编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TAu_MenuInfo', @level2type=N'COLUMN',@level2name=N'MenuID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'菜单名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TAu_MenuInfo', @level2type=N'COLUMN',@level2name=N'MenuName'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'URL地址' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TAu_MenuInfo', @level2type=N'COLUMN',@level2name=N'URL'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'排序编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TAu_MenuInfo', @level2type=N'COLUMN',@level2name=N'SortID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'状态' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TAu_MenuInfo', @level2type=N'COLUMN',@level2name=N'State'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'菜单信息表' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TAu_MenuInfo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'菜单编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TAu_MenuInfoDetail', @level2type=N'COLUMN',@level2name=N'MenuID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'递增的流水号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TAu_OperInfo', @level2type=N'COLUMN',@level2name=N'ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'操作员编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TAu_OperInfo', @level2type=N'COLUMN',@level2name=N'OperID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'角色编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TAu_OperInfo', @level2type=N'COLUMN',@level2name=N'RoleID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'操作员名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TAu_OperInfo', @level2type=N'COLUMN',@level2name=N'OperName'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'密码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TAu_OperInfo', @level2type=N'COLUMN',@level2name=N'Pwd'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'地址' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TAu_OperInfo', @level2type=N'COLUMN',@level2name=N'Address'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'联系电话' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TAu_OperInfo', @level2type=N'COLUMN',@level2name=N'LinkTel'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'QQ' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TAu_OperInfo', @level2type=N'COLUMN',@level2name=N'QQ'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'Email' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TAu_OperInfo', @level2type=N'COLUMN',@level2name=N'Email'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'手机号码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TAu_OperInfo', @level2type=N'COLUMN',@level2name=N'Mobile'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'排序编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TAu_OperInfo', @level2type=N'COLUMN',@level2name=N'SortID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'状态' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TAu_OperInfo', @level2type=N'COLUMN',@level2name=N'State'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'操作员信息表' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TAu_OperInfo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'递增的流水号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TAu_RoleInfo', @level2type=N'COLUMN',@level2name=N'ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'角色编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TAu_RoleInfo', @level2type=N'COLUMN',@level2name=N'RoleID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'角色名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TAu_RoleInfo', @level2type=N'COLUMN',@level2name=N'RoleName'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'排序编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TAu_RoleInfo', @level2type=N'COLUMN',@level2name=N'SortID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'状态' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TAu_RoleInfo', @level2type=N'COLUMN',@level2name=N'State'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'角色信息表' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TAu_RoleInfo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'递增的流水号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TBa_DeliveryInfo', @level2type=N'COLUMN',@level2name=N'ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'配送商编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TBa_DeliveryInfo', @level2type=N'COLUMN',@level2name=N'DeliveryID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'配送商名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TBa_DeliveryInfo', @level2type=N'COLUMN',@level2name=N'DeliveryName'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'地址' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TBa_DeliveryInfo', @level2type=N'COLUMN',@level2name=N'Address'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'联系人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TBa_DeliveryInfo', @level2type=N'COLUMN',@level2name=N'LinkName'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'联系电话' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TBa_DeliveryInfo', @level2type=N'COLUMN',@level2name=N'LinkTel'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'QQ' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TBa_DeliveryInfo', @level2type=N'COLUMN',@level2name=N'QQ'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'Email' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TBa_DeliveryInfo', @level2type=N'COLUMN',@level2name=N'Email'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'排序编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TBa_DeliveryInfo', @level2type=N'COLUMN',@level2name=N'SortID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'状态' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TBa_DeliveryInfo', @level2type=N'COLUMN',@level2name=N'State'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'配送商信息表' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TBa_DeliveryInfo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'递增的流水号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TBa_LogInfo', @level2type=N'COLUMN',@level2name=N'ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'操作员编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TBa_LogInfo', @level2type=N'COLUMN',@level2name=N'OperID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'菜单编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TBa_LogInfo', @level2type=N'COLUMN',@level2name=N'MenuID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'日志时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TBa_LogInfo', @level2type=N'COLUMN',@level2name=N'LogTime'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'IP' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TBa_LogInfo', @level2type=N'COLUMN',@level2name=N'IP'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'内容' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TBa_LogInfo', @level2type=N'COLUMN',@level2name=N'Content'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'日志信息表' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TBa_LogInfo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'递增的流水号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TBa_MembeAddrInfo', @level2type=N'COLUMN',@level2name=N'ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'用户名' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TBa_MembeAddrInfo', @level2type=N'COLUMN',@level2name=N'UserName'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'收货人姓名' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TBa_MembeAddrInfo', @level2type=N'COLUMN',@level2name=N'RecMan'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'电话' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TBa_MembeAddrInfo', @level2type=N'COLUMN',@level2name=N'Tel'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'货物的配送地址' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TBa_MembeAddrInfo', @level2type=N'COLUMN',@level2name=N'RecAddress'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'邮编' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TBa_MembeAddrInfo', @level2type=N'COLUMN',@level2name=N'PostCode'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'会员收货地址信息表' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TBa_MembeAddrInfo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'递增的流水号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TBa_MemberInfo', @level2type=N'COLUMN',@level2name=N'ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'用户名' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TBa_MemberInfo', @level2type=N'COLUMN',@level2name=N'UserName'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'密码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TBa_MemberInfo', @level2type=N'COLUMN',@level2name=N'Pwd'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'Email' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TBa_MemberInfo', @level2type=N'COLUMN',@level2name=N'Email'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'姓名' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TBa_MemberInfo', @level2type=N'COLUMN',@level2name=N'lName'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'余额' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TBa_MemberInfo', @level2type=N'COLUMN',@level2name=N'Balance'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'状态' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TBa_MemberInfo', @level2type=N'COLUMN',@level2name=N'Status'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'注册日期' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TBa_MemberInfo', @level2type=N'COLUMN',@level2name=N'RegDate'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'激活日期' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TBa_MemberInfo', @level2type=N'COLUMN',@level2name=N'ActiveDate'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'会员信息表' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TBa_MemberInfo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'递增的流水号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TBa_SupplierInfo', @level2type=N'COLUMN',@level2name=N'ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'供应商编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TBa_SupplierInfo', @level2type=N'COLUMN',@level2name=N'SupplierID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'供应商名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TBa_SupplierInfo', @level2type=N'COLUMN',@level2name=N'SupplierName'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'供应商助记码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TBa_SupplierInfo', @level2type=N'COLUMN',@level2name=N'SupplierAB'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'地址' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TBa_SupplierInfo', @level2type=N'COLUMN',@level2name=N'Address'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'联系人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TBa_SupplierInfo', @level2type=N'COLUMN',@level2name=N'LinkName'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'联系电话' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TBa_SupplierInfo', @level2type=N'COLUMN',@level2name=N'LinkTel'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'QQ' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TBa_SupplierInfo', @level2type=N'COLUMN',@level2name=N'QQ'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'Email' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TBa_SupplierInfo', @level2type=N'COLUMN',@level2name=N'Email'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'排序编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TBa_SupplierInfo', @level2type=N'COLUMN',@level2name=N'SortID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'状态' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TBa_SupplierInfo', @level2type=N'COLUMN',@level2name=N'State'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'供应商信息表' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TBa_SupplierInfo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'递增的流水号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TBa_SupplyRecordInfo', @level2type=N'COLUMN',@level2name=N'ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'用户名' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TBa_SupplyRecordInfo', @level2type=N'COLUMN',@level2name=N'UserName'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'付款账号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TBa_SupplyRecordInfo', @level2type=N'COLUMN',@level2name=N'PayAccountNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'付款开户行' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TBa_SupplyRecordInfo', @level2type=N'COLUMN',@level2name=N'PayBank'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'收款账号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TBa_SupplyRecordInfo', @level2type=N'COLUMN',@level2name=N'RecAccountNo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'收款开户行' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TBa_SupplyRecordInfo', @level2type=N'COLUMN',@level2name=N'RecBank'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备注' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TBa_SupplyRecordInfo', @level2type=N'COLUMN',@level2name=N'Remark'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'金额' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TBa_SupplyRecordInfo', @level2type=N'COLUMN',@level2name=N'TotalMoney'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'充值时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TBa_SupplyRecordInfo', @level2type=N'COLUMN',@level2name=N'SupplyTime'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'会员充值提现信息表' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TBa_SupplyRecordInfo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'递增的流水号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_InStockDetailsInfo', @level2type=N'COLUMN',@level2name=N'ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'商品编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_InStockDetailsInfo', @level2type=N'COLUMN',@level2name=N'MerchandiseID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'入库单号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_InStockDetailsInfo', @level2type=N'COLUMN',@level2name=N'BillCode'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'入库数量' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_InStockDetailsInfo', @level2type=N'COLUMN',@level2name=N'Num'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'进价' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_InStockDetailsInfo', @level2type=N'COLUMN',@level2name=N'Price'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'入库明细信息表' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_InStockDetailsInfo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'递增的流水号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_InStockInfo', @level2type=N'COLUMN',@level2name=N'ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'入库单号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_InStockInfo', @level2type=N'COLUMN',@level2name=N'BillCode'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'操作员编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_InStockInfo', @level2type=N'COLUMN',@level2name=N'OperID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'供应商编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_InStockInfo', @level2type=N'COLUMN',@level2name=N'SupplierID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'入库方式' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_InStockInfo', @level2type=N'COLUMN',@level2name=N'InType'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'入库时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_InStockInfo', @level2type=N'COLUMN',@level2name=N'InTime'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'经手人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_InStockInfo', @level2type=N'COLUMN',@level2name=N'Handler'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'金额' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_InStockInfo', @level2type=N'COLUMN',@level2name=N'TotalMoney'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备注' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_InStockInfo', @level2type=N'COLUMN',@level2name=N'Remark'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'入库信息表' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_InStockInfo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'递增的流水号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_MerchandiseCInfo', @level2type=N'COLUMN',@level2name=N'ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'商品类别编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_MerchandiseCInfo', @level2type=N'COLUMN',@level2name=N'MerchandiseCID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'商品类别名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_MerchandiseCInfo', @level2type=N'COLUMN',@level2name=N'MerchandiseCName'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'排序编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_MerchandiseCInfo', @level2type=N'COLUMN',@level2name=N'SortID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'状态' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_MerchandiseCInfo', @level2type=N'COLUMN',@level2name=N'State'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'商品类别信息表' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_MerchandiseCInfo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'递增的流水号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_MerchandiseInfo', @level2type=N'COLUMN',@level2name=N'ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'商品编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_MerchandiseInfo', @level2type=N'COLUMN',@level2name=N'MerchandiseID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'单位编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_MerchandiseInfo', @level2type=N'COLUMN',@level2name=N'UnitID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'促销状态编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_MerchandiseInfo', @level2type=N'COLUMN',@level2name=N'ProStatusID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'商品类别编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_MerchandiseInfo', @level2type=N'COLUMN',@level2name=N'MerchandiseCID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'商品名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_MerchandiseInfo', @level2type=N'COLUMN',@level2name=N'MerchandiseName'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'商品价格' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_MerchandiseInfo', @level2type=N'COLUMN',@level2name=N'Price'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'销售状态' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_MerchandiseInfo', @level2type=N'COLUMN',@level2name=N'SaleStatus'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'规格' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_MerchandiseInfo', @level2type=N'COLUMN',@level2name=N'Spec'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'描述' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_MerchandiseInfo', @level2type=N'COLUMN',@level2name=N'Describe'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'图片' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_MerchandiseInfo', @level2type=N'COLUMN',@level2name=N'PicPath'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'点击数' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_MerchandiseInfo', @level2type=N'COLUMN',@level2name=N'ClickCount'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备注' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_MerchandiseInfo', @level2type=N'COLUMN',@level2name=N'Remark'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'商品信息表' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_MerchandiseInfo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'递增的流水号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_OrderDetailsInfo', @level2type=N'COLUMN',@level2name=N'ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'订单号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_OrderDetailsInfo', @level2type=N'COLUMN',@level2name=N'BillCode'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'商品编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_OrderDetailsInfo', @level2type=N'COLUMN',@level2name=N'MerchandiseID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'单位编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_OrderDetailsInfo', @level2type=N'COLUMN',@level2name=N'UnitID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'数量' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_OrderDetailsInfo', @level2type=N'COLUMN',@level2name=N'Num'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'售价' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_OrderDetailsInfo', @level2type=N'COLUMN',@level2name=N'Price'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'入库明细信息表' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_OrderDetailsInfo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'订单号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_OrderInfo', @level2type=N'COLUMN',@level2name=N'BillCode'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'用户名' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_OrderInfo', @level2type=N'COLUMN',@level2name=N'UserName'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'配送商编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_OrderInfo', @level2type=N'COLUMN',@level2name=N'DeliveryID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'操作员编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_OrderInfo', @level2type=N'COLUMN',@level2name=N'OperID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'出库单号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_OrderInfo', @level2type=N'COLUMN',@level2name=N'OutBillCode'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'快递单号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_OrderInfo', @level2type=N'COLUMN',@level2name=N'PostBillCode'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'订单状态' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_OrderInfo', @level2type=N'COLUMN',@level2name=N'BillStatus'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'订购时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_OrderInfo', @level2type=N'COLUMN',@level2name=N'OrderTime'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'收货人姓名' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_OrderInfo', @level2type=N'COLUMN',@level2name=N'RecMan'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'联系电话' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_OrderInfo', @level2type=N'COLUMN',@level2name=N'LinkTel'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'配送地址' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_OrderInfo', @level2type=N'COLUMN',@level2name=N'RecAddress'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'邮编' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_OrderInfo', @level2type=N'COLUMN',@level2name=N'PostCode'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'金额' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_OrderInfo', @level2type=N'COLUMN',@level2name=N'TotalMoney'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备注' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_OrderInfo', @level2type=N'COLUMN',@level2name=N'Remark'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'订单信息表' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_OrderInfo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'递增的流水号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_OutStockDetailsInfo', @level2type=N'COLUMN',@level2name=N'ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'商品编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_OutStockDetailsInfo', @level2type=N'COLUMN',@level2name=N'MerchandiseID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'出库单号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_OutStockDetailsInfo', @level2type=N'COLUMN',@level2name=N'OutBillCode'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'数量' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_OutStockDetailsInfo', @level2type=N'COLUMN',@level2name=N'Num'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'单价' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_OutStockDetailsInfo', @level2type=N'COLUMN',@level2name=N'Price'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'出库明细信息表' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_OutStockDetailsInfo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'递增的流水号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_OutStockInfo', @level2type=N'COLUMN',@level2name=N'ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'出库单号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_OutStockInfo', @level2type=N'COLUMN',@level2name=N'OutBillCode'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'操作员编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_OutStockInfo', @level2type=N'COLUMN',@level2name=N'OperID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'出库时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_OutStockInfo', @level2type=N'COLUMN',@level2name=N'OutTime'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'经手人' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_OutStockInfo', @level2type=N'COLUMN',@level2name=N'Handler'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'出库方式' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_OutStockInfo', @level2type=N'COLUMN',@level2name=N'OutType'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'出库金额' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_OutStockInfo', @level2type=N'COLUMN',@level2name=N'TotalMoney'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备注' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_OutStockInfo', @level2type=N'COLUMN',@level2name=N'Remark'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'出库信息表' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_OutStockInfo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'促销状态编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_ProStatusInfo', @level2type=N'COLUMN',@level2name=N'ProStatusID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'促销状态名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_ProStatusInfo', @level2type=N'COLUMN',@level2name=N'ProStatusName'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'状态' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_ProStatusInfo', @level2type=N'COLUMN',@level2name=N'Status'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备注' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_ProStatusInfo', @level2type=N'COLUMN',@level2name=N'Remark'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'商品促销状态字典' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_ProStatusInfo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'递增的流水号' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_StockInfo', @level2type=N'COLUMN',@level2name=N'ID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'商品编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_StockInfo', @level2type=N'COLUMN',@level2name=N'MerchandiseID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'加权平均价' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_StockInfo', @level2type=N'COLUMN',@level2name=N'AvgPrice'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'库存数量' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_StockInfo', @level2type=N'COLUMN',@level2name=N'Num'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'商品库存信息表' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_StockInfo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'单位编码' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_UnitInfo', @level2type=N'COLUMN',@level2name=N'UnitID'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_UnitInfo', @level2type=N'COLUMN',@level2name=N'Name'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'状态' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_UnitInfo', @level2type=N'COLUMN',@level2name=N'Status'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'备注' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_UnitInfo', @level2type=N'COLUMN',@level2name=N'Remark'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'商品单位字典' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TMe_UnitInfo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_DiagramPane1', @value=N'[0E232FF0-B466-11cf-A24F-00AA00A3EFFF, 1.00]
Begin DesignProperties = 
   Begin PaneConfigurations = 
      Begin PaneConfiguration = 0
         NumPanes = 4
         Configuration = "(H (1[32] 4[39] 2[21] 3) )"
      End
      Begin PaneConfiguration = 1
         NumPanes = 3
         Configuration = "(H (1 [50] 4 [25] 3))"
      End
      Begin PaneConfiguration = 2
         NumPanes = 3
         Configuration = "(H (1 [50] 2 [25] 3))"
      End
      Begin PaneConfiguration = 3
         NumPanes = 3
         Configuration = "(H (4 [30] 2 [40] 3))"
      End
      Begin PaneConfiguration = 4
         NumPanes = 2
         Configuration = "(H (1 [56] 3))"
      End
      Begin PaneConfiguration = 5
         NumPanes = 2
         Configuration = "(H (2 [66] 3))"
      End
      Begin PaneConfiguration = 6
         NumPanes = 2
         Configuration = "(H (4 [50] 3))"
      End
      Begin PaneConfiguration = 7
         NumPanes = 1
         Configuration = "(V (3))"
      End
      Begin PaneConfiguration = 8
         NumPanes = 3
         Configuration = "(H (1[56] 4[18] 2) )"
      End
      Begin PaneConfiguration = 9
         NumPanes = 2
         Configuration = "(H (1 [75] 4))"
      End
      Begin PaneConfiguration = 10
         NumPanes = 2
         Configuration = "(H (1[66] 2) )"
      End
      Begin PaneConfiguration = 11
         NumPanes = 2
         Configuration = "(H (4 [60] 2))"
      End
      Begin PaneConfiguration = 12
         NumPanes = 1
         Configuration = "(H (1) )"
      End
      Begin PaneConfiguration = 13
         NumPanes = 1
         Configuration = "(V (4))"
      End
      Begin PaneConfiguration = 14
         NumPanes = 1
         Configuration = "(V (2))"
      End
      ActivePaneConfig = 0
   End
   Begin DiagramPane = 
      Begin Origin = 
         Top = 0
         Left = 0
      End
      Begin Tables = 
         Begin Table = "TAu_MenuInfo"
            Begin Extent = 
               Top = 6
               Left = 38
               Bottom = 199
               Right = 293
            End
            DisplayFlags = 280
            TopColumn = 0
         End
      End
   End
   Begin SQLPane = 
   End
   Begin DataPane = 
      Begin ParameterDefaults = ""
      End
      Begin ColumnWidths = 9
         Width = 284
         Width = 1500
         Width = 1500
         Width = 1500
         Width = 1500
         Width = 1500
         Width = 1500
         Width = 1500
         Width = 1500
      End
   End
   Begin CriteriaPane = 
      Begin ColumnWidths = 11
         Column = 1440
         Alias = 900
         Table = 2025
         Output = 720
         Append = 1400
         NewValue = 1170
         SortType = 1350
         SortOrder = 1410
         GroupBy = 1350
         Filter = 1350
         Or = 1350
         Or = 1350
         Or = 1350
      End
   End
End
' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'VIEW',@level1name=N'V_CheckTreeInfo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_DiagramPaneCount', @value=1 , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'VIEW',@level1name=N'V_CheckTreeInfo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_DiagramPane1', @value=N'[0E232FF0-B466-11cf-A24F-00AA00A3EFFF, 1.00]
Begin DesignProperties = 
   Begin PaneConfigurations = 
      Begin PaneConfiguration = 0
         NumPanes = 4
         Configuration = "(H (1[56] 4[22] 2[14] 3) )"
      End
      Begin PaneConfiguration = 1
         NumPanes = 3
         Configuration = "(H (1 [50] 4 [25] 3))"
      End
      Begin PaneConfiguration = 2
         NumPanes = 3
         Configuration = "(H (1 [50] 2 [25] 3))"
      End
      Begin PaneConfiguration = 3
         NumPanes = 3
         Configuration = "(H (4 [30] 2 [40] 3))"
      End
      Begin PaneConfiguration = 4
         NumPanes = 2
         Configuration = "(H (1 [56] 3))"
      End
      Begin PaneConfiguration = 5
         NumPanes = 2
         Configuration = "(H (2 [66] 3))"
      End
      Begin PaneConfiguration = 6
         NumPanes = 2
         Configuration = "(H (4 [50] 3))"
      End
      Begin PaneConfiguration = 7
         NumPanes = 1
         Configuration = "(V (3))"
      End
      Begin PaneConfiguration = 8
         NumPanes = 3
         Configuration = "(H (1[56] 4[18] 2) )"
      End
      Begin PaneConfiguration = 9
         NumPanes = 2
         Configuration = "(H (1 [75] 4))"
      End
      Begin PaneConfiguration = 10
         NumPanes = 2
         Configuration = "(H (1[66] 2) )"
      End
      Begin PaneConfiguration = 11
         NumPanes = 2
         Configuration = "(H (4 [60] 2))"
      End
      Begin PaneConfiguration = 12
         NumPanes = 1
         Configuration = "(H (1) )"
      End
      Begin PaneConfiguration = 13
         NumPanes = 1
         Configuration = "(V (4))"
      End
      Begin PaneConfiguration = 14
         NumPanes = 1
         Configuration = "(V (2))"
      End
      ActivePaneConfig = 0
   End
   Begin DiagramPane = 
      Begin Origin = 
         Top = 0
         Left = 0
      End
      Begin Tables = 
         Begin Table = "TMe_InStockDetailsInfo"
            Begin Extent = 
               Top = 6
               Left = 38
               Bottom = 160
               Right = 243
            End
            DisplayFlags = 280
            TopColumn = 0
         End
         Begin Table = "TMe_InStockInfo"
            Begin Extent = 
               Top = 82
               Left = 292
               Bottom = 282
               Right = 505
            End
            DisplayFlags = 280
            TopColumn = 0
         End
         Begin Table = "TMe_MerchandiseInfo"
            Begin Extent = 
               Top = 5
               Left = 541
               Bottom = 264
               Right = 740
            End
            DisplayFlags = 280
            TopColumn = 0
         End
      End
   End
   Begin SQLPane = 
   End
   Begin DataPane = 
      Begin ParameterDefaults = ""
      End
   End
   Begin CriteriaPane = 
      Begin ColumnWidths = 11
         Column = 1440
         Alias = 900
         Table = 1170
         Output = 720
         Append = 1400
         NewValue = 1170
         SortType = 1350
         SortOrder = 1410
         GroupBy = 1350
         Filter = 1350
         Or = 1350
         Or = 1350
         Or = 1350
      End
   End
End
' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'VIEW',@level1name=N'V_InStockChart'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_DiagramPaneCount', @value=1 , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'VIEW',@level1name=N'V_InStockChart'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_DiagramPane1', @value=N'[0E232FF0-B466-11cf-A24F-00AA00A3EFFF, 1.00]
Begin DesignProperties = 
   Begin PaneConfigurations = 
      Begin PaneConfiguration = 0
         NumPanes = 4
         Configuration = "(H (1[62] 4[26] 2[5] 3) )"
      End
      Begin PaneConfiguration = 1
         NumPanes = 3
         Configuration = "(H (1 [50] 4 [25] 3))"
      End
      Begin PaneConfiguration = 2
         NumPanes = 3
         Configuration = "(H (1 [50] 2 [25] 3))"
      End
      Begin PaneConfiguration = 3
         NumPanes = 3
         Configuration = "(H (4 [30] 2 [40] 3))"
      End
      Begin PaneConfiguration = 4
         NumPanes = 2
         Configuration = "(H (1 [56] 3))"
      End
      Begin PaneConfiguration = 5
         NumPanes = 2
         Configuration = "(H (2 [66] 3))"
      End
      Begin PaneConfiguration = 6
         NumPanes = 2
         Configuration = "(H (4 [50] 3))"
      End
      Begin PaneConfiguration = 7
         NumPanes = 1
         Configuration = "(V (3))"
      End
      Begin PaneConfiguration = 8
         NumPanes = 3
         Configuration = "(H (1[56] 4[18] 2) )"
      End
      Begin PaneConfiguration = 9
         NumPanes = 2
         Configuration = "(H (1 [75] 4))"
      End
      Begin PaneConfiguration = 10
         NumPanes = 2
         Configuration = "(H (1[66] 2) )"
      End
      Begin PaneConfiguration = 11
         NumPanes = 2
         Configuration = "(H (4 [60] 2))"
      End
      Begin PaneConfiguration = 12
         NumPanes = 1
         Configuration = "(H (1) )"
      End
      Begin PaneConfiguration = 13
         NumPanes = 1
         Configuration = "(V (4))"
      End
      Begin PaneConfiguration = 14
         NumPanes = 1
         Configuration = "(V (2))"
      End
      ActivePaneConfig = 0
   End
   Begin DiagramPane = 
      Begin Origin = 
         Top = 0
         Left = 0
      End
      Begin Tables = 
         Begin Table = "TAu_MenuInfo"
            Begin Extent = 
               Top = 6
               Left = 38
               Bottom = 180
               Right = 232
            End
            DisplayFlags = 280
            TopColumn = 0
         End
         Begin Table = "TAu_Authorization"
            Begin Extent = 
               Top = 5
               Left = 384
               Bottom = 119
               Right = 533
            End
            DisplayFlags = 280
            TopColumn = 0
         End
      End
   End
   Begin SQLPane = 
   End
   Begin DataPane = 
      Begin ParameterDefaults = ""
      End
   End
   Begin CriteriaPane = 
      Begin ColumnWidths = 11
         Column = 1440
         Alias = 900
         Table = 1170
         Output = 720
         Append = 1400
         NewValue = 1170
         SortType = 1350
         SortOrder = 1410
         GroupBy = 1350
         Filter = 1350
         Or = 1350
         Or = 1350
         Or = 1350
      End
   End
End
' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'VIEW',@level1name=N'V_MenuInfo1'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_DiagramPaneCount', @value=1 , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'VIEW',@level1name=N'V_MenuInfo1'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_DiagramPane1', @value=N'[0E232FF0-B466-11cf-A24F-00AA00A3EFFF, 1.00]
Begin DesignProperties = 
   Begin PaneConfigurations = 
      Begin PaneConfiguration = 0
         NumPanes = 4
         Configuration = "(H (1[54] 4[19] 2[20] 3) )"
      End
      Begin PaneConfiguration = 1
         NumPanes = 3
         Configuration = "(H (1 [50] 4 [25] 3))"
      End
      Begin PaneConfiguration = 2
         NumPanes = 3
         Configuration = "(H (1 [50] 2 [25] 3))"
      End
      Begin PaneConfiguration = 3
         NumPanes = 3
         Configuration = "(H (4 [30] 2 [40] 3))"
      End
      Begin PaneConfiguration = 4
         NumPanes = 2
         Configuration = "(H (1 [56] 3))"
      End
      Begin PaneConfiguration = 5
         NumPanes = 2
         Configuration = "(H (2 [66] 3))"
      End
      Begin PaneConfiguration = 6
         NumPanes = 2
         Configuration = "(H (4 [50] 3))"
      End
      Begin PaneConfiguration = 7
         NumPanes = 1
         Configuration = "(V (3))"
      End
      Begin PaneConfiguration = 8
         NumPanes = 3
         Configuration = "(H (1[56] 4[18] 2) )"
      End
      Begin PaneConfiguration = 9
         NumPanes = 2
         Configuration = "(H (1 [75] 4))"
      End
      Begin PaneConfiguration = 10
         NumPanes = 2
         Configuration = "(H (1[66] 2) )"
      End
      Begin PaneConfiguration = 11
         NumPanes = 2
         Configuration = "(H (4 [60] 2))"
      End
      Begin PaneConfiguration = 12
         NumPanes = 1
         Configuration = "(H (1) )"
      End
      Begin PaneConfiguration = 13
         NumPanes = 1
         Configuration = "(V (4))"
      End
      Begin PaneConfiguration = 14
         NumPanes = 1
         Configuration = "(V (2))"
      End
      ActivePaneConfig = 0
   End
   Begin DiagramPane = 
      Begin Origin = 
         Top = 0
         Left = 0
      End
      Begin Tables = 
         Begin Table = "TMe_OutStockInfo"
            Begin Extent = 
               Top = 12
               Left = 662
               Bottom = 195
               Right = 854
            End
            DisplayFlags = 280
            TopColumn = 0
         End
         Begin Table = "TMe_OutStockDetailsInfo"
            Begin Extent = 
               Top = 10
               Left = 398
               Bottom = 184
               Right = 613
            End
            DisplayFlags = 280
            TopColumn = 0
         End
         Begin Table = "TMe_MerchandiseInfo"
            Begin Extent = 
               Top = 0
               Left = 18
               Bottom = 255
               Right = 290
            End
            DisplayFlags = 280
            TopColumn = 0
         End
      End
   End
   Begin SQLPane = 
   End
   Begin DataPane = 
      Begin ParameterDefaults = ""
      End
   End
   Begin CriteriaPane = 
      Begin ColumnWidths = 12
         Column = 1440
         Alias = 900
         Table = 1170
         Output = 720
         Append = 1400
         NewValue = 1170
         SortType = 1350
         SortOrder = 1410
         GroupBy = 1350
         Filter = 1350
         Or = 1350
         Or = 1350
         Or = 1350
      End
   End
End
' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'VIEW',@level1name=N'V_OutStockChart'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_DiagramPaneCount', @value=1 , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'VIEW',@level1name=N'V_OutStockChart'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_DiagramPane1', @value=N'[0E232FF0-B466-11cf-A24F-00AA00A3EFFF, 1.00]
Begin DesignProperties = 
   Begin PaneConfigurations = 
      Begin PaneConfiguration = 0
         NumPanes = 4
         Configuration = "(H (1[40] 4[20] 2[20] 3) )"
      End
      Begin PaneConfiguration = 1
         NumPanes = 3
         Configuration = "(H (1 [50] 4 [25] 3))"
      End
      Begin PaneConfiguration = 2
         NumPanes = 3
         Configuration = "(H (1 [50] 2 [25] 3))"
      End
      Begin PaneConfiguration = 3
         NumPanes = 3
         Configuration = "(H (4 [30] 2 [40] 3))"
      End
      Begin PaneConfiguration = 4
         NumPanes = 2
         Configuration = "(H (1 [56] 3))"
      End
      Begin PaneConfiguration = 5
         NumPanes = 2
         Configuration = "(H (2 [66] 3))"
      End
      Begin PaneConfiguration = 6
         NumPanes = 2
         Configuration = "(H (4 [50] 3))"
      End
      Begin PaneConfiguration = 7
         NumPanes = 1
         Configuration = "(V (3))"
      End
      Begin PaneConfiguration = 8
         NumPanes = 3
         Configuration = "(H (1[56] 4[18] 2) )"
      End
      Begin PaneConfiguration = 9
         NumPanes = 2
         Configuration = "(H (1 [75] 4))"
      End
      Begin PaneConfiguration = 10
         NumPanes = 2
         Configuration = "(H (1[66] 2) )"
      End
      Begin PaneConfiguration = 11
         NumPanes = 2
         Configuration = "(H (4 [60] 2))"
      End
      Begin PaneConfiguration = 12
         NumPanes = 1
         Configuration = "(H (1) )"
      End
      Begin PaneConfiguration = 13
         NumPanes = 1
         Configuration = "(V (4))"
      End
      Begin PaneConfiguration = 14
         NumPanes = 1
         Configuration = "(V (2))"
      End
      ActivePaneConfig = 0
   End
   Begin DiagramPane = 
      Begin Origin = 
         Top = 0
         Left = 0
      End
      Begin Tables = 
         Begin Table = "TAu_RoleInfo"
            Begin Extent = 
               Top = 6
               Left = 38
               Bottom = 201
               Right = 230
            End
            DisplayFlags = 280
            TopColumn = 0
         End
      End
   End
   Begin SQLPane = 
   End
   Begin DataPane = 
      Begin ParameterDefaults = ""
      End
   End
   Begin CriteriaPane = 
      Begin ColumnWidths = 11
         Column = 1440
         Alias = 900
         Table = 1170
         Output = 720
         Append = 1400
         NewValue = 1170
         SortType = 1350
         SortOrder = 1410
         GroupBy = 1350
         Filter = 1350
         Or = 1350
         Or = 1350
         Or = 1350
      End
   End
End
' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'VIEW',@level1name=N'V_RoleInfo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_DiagramPaneCount', @value=1 , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'VIEW',@level1name=N'V_RoleInfo'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_DiagramPane1', @value=N'[0E232FF0-B466-11cf-A24F-00AA00A3EFFF, 1.00]
Begin DesignProperties = 
   Begin PaneConfigurations = 
      Begin PaneConfiguration = 0
         NumPanes = 4
         Configuration = "(H (1[40] 4[20] 2[20] 3) )"
      End
      Begin PaneConfiguration = 1
         NumPanes = 3
         Configuration = "(H (1 [50] 4 [25] 3))"
      End
      Begin PaneConfiguration = 2
         NumPanes = 3
         Configuration = "(H (1 [50] 2 [25] 3))"
      End
      Begin PaneConfiguration = 3
         NumPanes = 3
         Configuration = "(H (4 [30] 2 [40] 3))"
      End
      Begin PaneConfiguration = 4
         NumPanes = 2
         Configuration = "(H (1 [56] 3))"
      End
      Begin PaneConfiguration = 5
         NumPanes = 2
         Configuration = "(H (2 [66] 3))"
      End
      Begin PaneConfiguration = 6
         NumPanes = 2
         Configuration = "(H (4 [50] 3))"
      End
      Begin PaneConfiguration = 7
         NumPanes = 1
         Configuration = "(V (3))"
      End
      Begin PaneConfiguration = 8
         NumPanes = 3
         Configuration = "(H (1[56] 4[18] 2) )"
      End
      Begin PaneConfiguration = 9
         NumPanes = 2
         Configuration = "(H (1 [75] 4))"
      End
      Begin PaneConfiguration = 10
         NumPanes = 2
         Configuration = "(H (1[66] 2) )"
      End
      Begin PaneConfiguration = 11
         NumPanes = 2
         Configuration = "(H (4 [60] 2))"
      End
      Begin PaneConfiguration = 12
         NumPanes = 1
         Configuration = "(H (1) )"
      End
      Begin PaneConfiguration = 13
         NumPanes = 1
         Configuration = "(V (4))"
      End
      Begin PaneConfiguration = 14
         NumPanes = 1
         Configuration = "(V (2))"
      End
      ActivePaneConfig = 0
   End
   Begin DiagramPane = 
      Begin Origin = 
         Top = 0
         Left = 0
      End
      Begin Tables = 
         Begin Table = "TMe_StockInfo"
            Begin Extent = 
               Top = 6
               Left = 38
               Bottom = 180
               Right = 227
            End
            DisplayFlags = 280
            TopColumn = 0
         End
         Begin Table = "TMe_MerchandiseInfo"
            Begin Extent = 
               Top = 3
               Left = 396
               Bottom = 201
               Right = 617
            End
            DisplayFlags = 280
            TopColumn = 0
         End
      End
   End
   Begin SQLPane = 
   End
   Begin DataPane = 
      Begin ParameterDefaults = ""
      End
   End
   Begin CriteriaPane = 
      Begin ColumnWidths = 11
         Column = 1440
         Alias = 900
         Table = 1170
         Output = 720
         Append = 1400
         NewValue = 1170
         SortType = 1350
         SortOrder = 1410
         GroupBy = 1350
         Filter = 1350
         Or = 1350
         Or = 1350
         Or = 1350
      End
   End
End
' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'VIEW',@level1name=N'V_StockInfoChart'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_DiagramPaneCount', @value=1 , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'VIEW',@level1name=N'V_StockInfoChart'
GO
USE [master]
GO
ALTER DATABASE [oss] SET  READ_WRITE 
GO
